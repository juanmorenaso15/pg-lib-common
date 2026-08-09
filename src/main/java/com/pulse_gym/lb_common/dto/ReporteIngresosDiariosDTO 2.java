package com.pulse_gym.lb_common.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.Data;

@Data
public class ReporteIngresosDiariosDTO {
    
    /**
     * Fecha del reporte de ingresos diarios.
     */
    private LocalDate fecha;

    /**
     * Total de ingresos del día.
     */
    private BigDecimal totalIngresos;

    /**
     * Cantidad de pagos realizados.
     */
    private Long cantidadPagos;

    /**
     * Mensaje del reporte.
     */
    private String mensaje;
}
