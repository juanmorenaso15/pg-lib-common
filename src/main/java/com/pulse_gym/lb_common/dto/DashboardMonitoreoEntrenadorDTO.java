package com.pulse_gym.lb_common.dto;

import java.util.List;

import lombok.Data;

/**
 * DTO para el dashboard de monitoreo del entrenador.
 * Se utiliza en el endpoint RF18.4.
 */
@Data
public class DashboardMonitoreoEntrenadorDTO {

    /** ID del entrenador */
    private Long idEntrenador;

    /** Nombre del entrenador */
    private String nombreEntrenador;

    /** Lista de socios asignados al entrenador */
    private List<ResumenSocioDTO> sociosAsignados;

}