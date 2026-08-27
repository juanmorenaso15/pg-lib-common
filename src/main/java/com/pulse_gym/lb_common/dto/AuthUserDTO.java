package com.pulse_gym.lb_common.dto;

import java.time.LocalDateTime;

import com.pulse_gym.lb_common.enums.EnumRol;

import lombok.Data;

@Data
public class AuthUserDTO {
    /**
     * ID del usuario autenticado
     */
    private Long id;

    /**
     * Correo electrónico del usuario autenticado
     */
    private String email;
    /**
     * Nombre de usuario autenticado
     */
    private String username;
    /**
     * Rol del usuario autenticado
     */
    private EnumRol rol;
    /**
     * Estado del usuario autenticado
     */
    private Boolean estado;

    private LocalDateTime fechaRegistro;

    private String fotoUrl;
}
