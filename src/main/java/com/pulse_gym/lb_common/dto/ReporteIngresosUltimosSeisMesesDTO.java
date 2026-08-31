package com.pulse_gym.lb_common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReporteIngresosUltimosSeisMesesDTO {

    /** Lista de ingresos mensuales de los últimos seis meses */
    private List<ReporteIngresosMensualesDTO> meses;

    /** Total acumulado de ingresos en el período */
    private BigDecimal totalAcumulado;

}