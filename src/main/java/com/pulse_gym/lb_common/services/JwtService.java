package com.pulse_gym.lb_common.services;

import java.util.Date;
import java.util.function.Function;

import javax.crypto.SecretKey;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Service
public class JwtService {

    @Value("${security.jwt.secret-key}")
    String secretKey;

    @Value("${security.jwt.token-expiration}")
    Long tokenExpiration;

    /**
     * Obtiene la clave de firma a partir de la clave secreta en Base64
     * 
     * @return Clave secreta para firmar/verificar JWT
     */
    private SecretKey getSignKey() {
        byte[] keyBytes = Decoders.BASE64.decode(secretKey);
        return Keys.hmacShaKeyFor(keyBytes);
    }

    /**
     * Genera un token JWT con los datos del usuario
     */
    public String generateToken(Long userId, String rol, String email, String username) {
        return Jwts.builder()
                .claim("userId", userId)
                .claim("rol", rol)
                .claim("username", username)  
                .subject(email)               
                .issuedAt(new Date())
                .expiration(new Date(System.currentTimeMillis() + tokenExpiration))
                .signWith(getSignKey())
                .compact();
    }

    /**
     * Valida si un token JWT es válido
     */
    public Boolean isTokenValid(String token) {
        try {
            Jwts.parser().verifyWith(getSignKey()).build().parseSignedClaims(token);
            return true;
        } catch (JwtException e) {
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Extrae los claims del token
     */
    public <T> T extractClaims(String token, Function<Claims, T> resolver) {
        final Claims claims = Jwts.parser()
                .verifyWith(getSignKey())
                .build()
                .parseSignedClaims(token)
                .getPayload();
        return resolver.apply(claims);
    }

    /**
     * xtrae el EMAIL del token (subject)
     */
    public String extractEmail(String token) {
        return extractClaims(token, Claims::getSubject);
    }

    /**
     * Extrae el USERNAME del token (claim)
     */
    public String extractUsername(String token) {
        return extractClaims(token, claims -> {
            Object username = claims.get("username");
            return username != null ? username.toString() : null;
        });
    }

    /**
     * Extrae el ID del usuario del token
     */
    public Long extractUserId(String token) {
        return extractClaims(token, claims -> {
            Number userId = claims.get("userId", Number.class);
            return userId != null ? userId.longValue() : null;
        });
    }

    /**
     * Extrae el rol del usuario del token
     */
    public String extractRol(String token) {
        return extractClaims(token, claims -> {
            Object rol = claims.get("rol");
            return rol != null ? rol.toString() : null;
        });
    }

    /**
     * Extrae el email del usuario del token (deprecado - usar extractEmail)
     */
    @Deprecated
    public String extractGmail(String token) {
        return extractEmail(token);
    }

    /**
     * Renueva un token JWT
     */
    public String refreshToken(String token) throws Exception {
        Claims claims;
        try {
            claims = Jwts.parser()
                    .verifyWith(getSignKey())
                    .build()
                    .parseSignedClaims(token)
                    .getPayload();
        } catch (ExpiredJwtException e) {
            throw new Exception("Token is expired");
        } catch (JwtException e) {
            throw new Exception("Token is invalid");
        }

        Number userIdNum = claims.get("userId", Number.class);
        Long userId = userIdNum != null ? userIdNum.longValue() : null;
        Object rolObj = claims.get("rol");
        String rol = rolObj != null ? rolObj.toString() : null;
        String email = claims.getSubject();
        String username = claims.get("username", String.class);

        if (username == null || username.isEmpty()) {
            username = email != null ? email.split("@")[0] : "usuario";
        }

        return generateToken(userId, rol, email, username);
    }
}