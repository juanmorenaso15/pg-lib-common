package com.pulse_gym.lb_common.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class PlanNutricionalHistorialResponseDTO {

    /** ID del historial */
    private Long idHistorial;

    /** Versión del plan en este historial */
    private Integer version;

    /** Datos del plan en formato JSON */
    private Object datosJson;

    /** Usuario que realizó la modificación */
    private String modificadoPor;

    /** Motivo de la modificación */
    private String motivo;

    /** Fecha de la modificación */
    private LocalDateTime fechaModificacion;
}