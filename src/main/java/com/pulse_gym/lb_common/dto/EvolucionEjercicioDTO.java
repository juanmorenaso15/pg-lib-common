package com.pulse_gym.lb_common.dto;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class EvolucionEjercicioDTO {

    /** Nombre del ejercicio */
    private String nombreEjercicio;

    /** Progreso medido en peso o valor numérico */
    private BigDecimal progreso;

    /** Estado del progreso (PROGRESO, ESTANCADO, RETROCESO) */
    private String estado;
}