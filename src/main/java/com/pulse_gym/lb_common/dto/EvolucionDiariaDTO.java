package com.pulse_gym.lb_common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EvolucionDiariaDTO {

    /** Fecha de la medición */
    private LocalDate fecha;

    /** Peso registrado en kilogramos */
    private Double peso;

    /** Porcentaje de grasa corporal */
    private Double porcentajeGrasa;

    /** Masa muscular en kilogramos */
    private Double masaMuscular;
}