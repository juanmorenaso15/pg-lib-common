package com.pulse_gym.lb_common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DatoPeriodoDTO {

    /**
     * Fecha del dato (día, semana o mes)
     */
    private LocalDate fecha;

    /**
     * Etiqueta para mostrar (ej: "2026-08-01" o "Semana 1")
     */
    private String etiqueta;

    /**
     * Cantidad de socios en esa fecha
     */
    private Long totalSocios;
}