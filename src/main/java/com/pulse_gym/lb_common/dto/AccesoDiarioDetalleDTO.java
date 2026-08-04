package com.pulse_gym.lb_common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccesoDiarioDetalleDTO {

    /**
     * Identificador único del acceso diario.
     */
    private Long socioId;

    /**
     * Tipo de acceso (por ejemplo, entrada, salida).
     */
    private String tipoAcceso;

    /**
     * Fecha y hora del acceso.
     */
    private LocalDateTime fechaHora;
}