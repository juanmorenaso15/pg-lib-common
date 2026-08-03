package com.pulse_gym.lb_common.dto;

import java.math.BigDecimal;

import com.pulse_gym.lb_common.enums.EnumEstadoEjecucionEjercicio;

import lombok.Data;

@Data
public class DetalleSesionResponseDTO {

    /** ID del detalle de sesión */
    private Long idDetalleSesion;

    /** ID del detalle de rutina asociado */
    private Long idDetalleRutina;

    /** Nombre del ejercicio */
    private String nombreEjercicio;

    /** Grupo muscular del ejercicio */
    private String grupoMuscular;

    /** Número de series completadas */
    private Integer seriesCompletadas;

    /** Número de repeticiones realizadas */
    private Integer repeticionesRealizadas;

    /** Peso utilizado */
    private BigDecimal pesoUsado;

    /** Estado de ejecución del ejercicio */
    private EnumEstadoEjecucionEjercicio estado;

    /** Observaciones adicionales */
    private String observaciones;
}