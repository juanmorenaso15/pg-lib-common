package com.pulse_gym.lb_common.dto;

import lombok.Data;

@Data
public class ResumenSocioDTO {

    /** ID del socio */
    private Long idSocio;

    /** Nombre completo del socio */
    private String nombreSocio;

    /** Porcentaje de cumplimiento semanal */
    private Double porcentajeCumplimiento;

    /** Racha actual de días entrenando */
    private Integer rachaActual;

    /** Días sin entrenar */
    private Integer diasSinEntrenar;

    /** Estado de evolución de cargas (PROGRESO, ESTANCADO, RETROCESO) */
    private String estadoEvolucionCargas;
}