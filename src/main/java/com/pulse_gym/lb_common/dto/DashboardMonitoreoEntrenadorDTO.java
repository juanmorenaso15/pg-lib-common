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

/**
 * DTO interno con el resumen de cada socio asignado al entrenador.
 * El estadoEvolucionCargas puede ser: PROGRESO, ESTANCADO, RETROCESO.
 */
@Data
class ResumenSocioDTO {

    /** ID del socio */
    private Long idSocio;

    /** Nombre del socio */
    private String nombreSocio;

    /** Porcentaje de cumplimiento del socio */
    private Double porcentajeCumplimiento;

    /** Racha actual de días entrenando */
    private Integer rachaActual;

    /** Días sin entrenar */
    private Integer diasSinEntrenar;

    /** Estado de evolución de cargas (PROGRESO, ESTANCADO, RETROCESO) */
    private String estadoEvolucionCargas;
}
