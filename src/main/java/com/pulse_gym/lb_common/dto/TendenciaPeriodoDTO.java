package com.pulse_gym.lb_common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TendenciaPeriodoDTO {

    /**
     * Tipo de reporte (SEMANAL o MENSUAL)
     */
    private String tipoReporte;

    /**
     * Período analizado (ej: "2026-08-01 al 2026-08-07" o "Agosto 2026")
     */
    private String periodo;

    /**
     * Lista de valores por día/semana/mes para el período actual
     */
    private List<DatoPeriodoDTO> datosPeriodoActual;

    /**
     * Lista de valores por día/semana/mes para el período anterior (comparativa)
     */
    private List<DatoPeriodoDTO> datosPeriodoAnterior;

    /**
     * Variación porcentual entre períodos
     */
    private Double variacionPorcentual;

    /**
     * Mensaje informativo
     */
    private String mensaje;
}