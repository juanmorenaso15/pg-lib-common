package com.pulse_gym.lb_common.dto;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class EvolucionEjercicioDTO {
    
    /** */
    private String nombreEjercicio;
    
    /** */
    private BigDecimal progreso;
    
    /** */
    private String estado;
}