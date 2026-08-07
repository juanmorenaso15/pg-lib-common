package com.pulse_gym.lb_common.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReporteIngresosMensualesDTO {

    /**
     * Mes del reporte
     */
    private Long mes;

    /**
     * Año del reporte
     */
    private Long anio;

    /**
     * Detalle de los ingresos mensuales
     */
    private List<MembresiaIngresoDTO> detalle;

    /**
     * Total general de los ingresos
     */
    private BigDecimal totalGeneral;

    /**
     * Mensaje del reporte
     */
    private String mensaje;
}