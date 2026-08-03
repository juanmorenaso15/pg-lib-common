package com.pulse_gym.lb_common.dto;

import java.math.BigDecimal;

import com.pulse_gym.lb_common.enums.EnumEstadoEjecucionEjercicio;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class DetalleEjercicioSesionDTO {

    /** ID del detalle de rutina asociado */
    @NotNull(message = "El ID del detalle de rutina es obligatorio")
    private Long idDetalleRutina;

    /** Número de series completadas */
    @NotNull(message = "Las series completadas son obligatorias")
    private Integer seriesCompletadas;

    /** Número de repeticiones realizadas */
    private Integer repeticionesRealizadas;

    /** Peso utilizado en la sesión */
    private BigDecimal pesoUsado;

    /** Estado de ejecución del ejercicio (COMPLETADO, PARCIAL, NO_REALIZADO) */
    private EnumEstadoEjecucionEjercicio estado;

    /** Observaciones adicionales sobre el ejercicio */
    private String observaciones;
}