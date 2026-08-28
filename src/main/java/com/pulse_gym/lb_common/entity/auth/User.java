package com.pulse_gym.lb_common.entity.auth;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.pulse_gym.lb_common.enums.EnumRol;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "usuarios_auth")
public class User {

    /**
     * Identificador único del usuario, generado automáticamente por la base de
     * datos
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    /**
     * Nombre de usuario único para autenticación
     */
    @Column(name = "email", nullable = false, length = 150)
    private String email;

    /**
     * Contraseña cifrada del usuario
     */
    @Column(name = "password", nullable = false, length = 255)
    private String password;

    /**
     * Rol asignado al usuario dentro del gimnasio. Se persiste como texto mediante
     * un ENUM nativo
     */
    @Column(name = "username", nullable = false, length = 50)
    private String username;

    /**
     * Rol del usuario
     */
    @Enumerated(EnumType.STRING)
    @Column(name = "rol", nullable = false, length = 20)
    private EnumRol rol;

    /**
     * Estado de la cuenta (activo/inactivo)
     */
    @Column(name = "estado", nullable = false)
    private Boolean estado;

    /**
     * Fecha y hora de creación del usuario
     */
    @Column(name = "fecha_registro", nullable = false)
    private LocalDateTime fechaRegistro;

    /** Lista de tokens de recuperación de contraseña del usuario */
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<PasswordResetToken> resetTokens = new ArrayList<>();

    /** Número de intentos fallidos de inicio de sesión */
    @Column(name = "failed_attempts", nullable = false)
    private Integer failedAttempts = 0;

    /** Fecha y hora de bloqueo del usuario */
    @Column(name = "lock_time")
    private LocalDateTime lockTime;

    /**
     * Indica si el usuario debe cambiar su contraseña en el próximo inicio de
     * sesión
     */
    @Column(name = "requiere_cambio_contrasena", nullable = false)
    private Boolean requiereCambioContrasena = false;

    /**
     * Verifica si la cuenta del usuario está bloqueada debido a intentos fallidos
     * de inicio de sesión.
     * 
     * @return true si la cuenta está bloqueada, false en caso contrario
     */
    public boolean isLocked() {
        if (lockTime == null)
            return false;
        return lockTime.plusSeconds(30).isAfter(LocalDateTime.now());
    }

    /**
     * Incrementa el número de intentos fallidos de inicio de sesión.
     */
    public void incrementFailedAttempts() {
        this.failedAttempts = (this.failedAttempts == null ? 0 : this.failedAttempts) + 1;
        if (this.failedAttempts >= 3) {
            this.lockTime = LocalDateTime.now();
        }
    }

    /**
     * Reinicia el número de intentos fallidos de inicio de sesión.
     */
    public void resetFailedAttempts() {
        this.failedAttempts = 0;
        this.lockTime = null;
    }
}
