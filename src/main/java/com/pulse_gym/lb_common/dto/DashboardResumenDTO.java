package com.pulse_gym.lb_common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DashboardResumenDTO {

    /** Total de usuarios registrados */
    private Long totalUsuarios;

    /** Usuarios con estado activo */
    private Long usuariosActivos;

    /** Usuarios con estado inactivo */
    private Long usuariosInactivos;

    /** Nuevos usuarios registrados en el mes actual */
    private Long nuevosDelMes;

    /** Reporte de afluencia de socios del día de hoy */
    private ReporteSociosPorDiaDTO afluenciaHoy;

    /** Reporte de afluencia de socios del día de ayer */
    private ReporteSociosPorDiaDTO afluenciaAyer;

    /** Total de equipos registrados */
    private Integer totalEquipos;

    /** Equipos en estado de mantenimiento */
    private Integer equiposEnMantenimiento;

    /** Lista de equipos con estado crítico */
    private List<ConsultaGeneralEquipoDTO> equiposCriticos;

    /** Reporte de ingresos de los últimos seis meses */
    private ReporteIngresosUltimosSeisMesesDTO ingresosSeisMeses;

    /** Lista de membresías próximas a vencer */
    private List<MembresiaPorVencerDTO> membresiasPorVencer;
}