package com.pulse_gym.lb_common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReporteSociosPorDiaDTO {

    /**
     * Fecha del reporte
     */
    private LocalDate fecha;

    /**
     * Total de socios
     */
    private Long totalSocios;

    /**
     * Mensaje de error
     */
    private String mensaje; 
}