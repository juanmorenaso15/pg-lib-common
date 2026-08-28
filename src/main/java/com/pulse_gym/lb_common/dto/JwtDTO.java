package com.pulse_gym.lb_common.dto;

import lombok.Data;

@Data
public class JwtDTO {

    /**
     * JWT del usuario logueado
     */
    private String jwt;

    /**
     * Indica si el usuario debe cambiar su contraseña en el próximo inicio de
     * sesión
     */
    private Boolean requiereCambioContrasena;
}
