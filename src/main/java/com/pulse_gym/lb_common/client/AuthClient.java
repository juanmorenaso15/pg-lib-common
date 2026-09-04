package com.pulse_gym.lb_common.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pulse_gym.lb_common.dto.AuthUserDTO;

@FeignClient(name = "pg-ms-auth", url = "${microservicio.auth.url:http://pg-ms-auth:8090}")
public interface AuthClient {

    /**
     * Obtiene la información de un usuario autenticado por su ID
     * 
     * @param id ID del usuario
     * @return DTO con la información del usuario autenticado
     */
    @GetMapping("/auth/api/internal/users/{id}")
    AuthUserDTO obtenerUsuarioPorId(@PathVariable("id") Long id);

    /**
     * Valida el rol de un usuario por su email
     * 
     * @param email Email del usuario
     * @return DTO con la información del usuario y su rol
     */
    @GetMapping("/auth/api/internal/users/validate-rol")
    AuthUserDTO validarRolPorEmail(@RequestParam("email") String email);

    /**
     * Cambia el estado de un usuario por email (endpoint interno para Auth)
     * 
     * @param email  Email del usuario
     * @param estado Nuevo estado (true = activo, false = inactivo)
     */
    @PutMapping("/auth/api/internal/users/email/estado")
    void cambiarEstadoInternoPorEmail(@RequestParam("email") String email, @RequestParam("estado") Boolean estado);
}