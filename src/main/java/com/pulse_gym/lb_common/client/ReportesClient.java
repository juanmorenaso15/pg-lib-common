package com.pulse_gym.lb_common.client;

import java.time.LocalDate;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pulse_gym.lb_common.dto.ReporteIngresosUltimosSeisMesesDTO;
import com.pulse_gym.lb_common.dto.ReporteSociosPorDiaDTO;

@FeignClient(name = "pg-ms-reports", contextId = "reportesClient", url = "${microservicio.reports.url:http://pg-ms-reports:8084}")
public interface ReportesClient {

    /**
     * Obtiene el reporte de afluencia de socios del día de hoy
     * 
     * @return Reporte de afluencia del día actual
     */
    @GetMapping("/api/reportes/afluencia/hoy")
    ReporteSociosPorDiaDTO obtenerAfluenciaHoy();

    /**
     * Obtiene el reporte de afluencia de socios para una fecha específica
     * 
     * @param fecha Fecha a consultar (formato ISO)
     * @return Reporte de afluencia para la fecha indicada
     */
    @GetMapping("/api/reportes/afluencia/socios-por-dia")
    ReporteSociosPorDiaDTO obtenerAfluenciaPorDia(
            @RequestParam("fecha") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fecha);

    /**
     * Obtiene el reporte de ingresos de los últimos seis meses
     * 
     * @return Reporte de ingresos mensuales del último semestre
     */
    @GetMapping("/api/reportes/ingresos/ultimos-seis-meses")
    ReporteIngresosUltimosSeisMesesDTO obtenerIngresosUltimosSeisMeses();

}