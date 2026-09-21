package com.pulse_gym.lb_common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioMetricasResponseDTO {
    
    /** Total de usuarios registrados en el sistema */
    private long totalUsuarios;

    /** Total de usuarios con estado inactivo */
    private long totalInactivos;

    /** Total de usuarios con rol administrador */
    private long totalAdministradores;

    /** Total de usuarios con rol entrenador */
    private long totalEntrenadores;

    /** Total de usuarios con rol recepcionista */
    private long totalRecepcionistas;

    /** Total de usuarios con rol socio */
    private long totalSocios;
}