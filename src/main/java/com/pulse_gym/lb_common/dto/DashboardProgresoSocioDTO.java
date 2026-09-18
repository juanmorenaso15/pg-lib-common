package com.pulse_gym.lb_common.dto;

import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class DashboardProgresoSocioDTO {

    /** ID del socio */
    private Long idSocio;

    /** Nombre del socio */
    private String nombreSocio;

    /** Racha de días entrenando */
    private Integer rachaDiasEntrenando;

    /** Porcentaje de cumplimiento semanal */
    private Double porcentajeCumplimientoSemanal;

    /** Porcentaje de cumplimiento de la semana anterior */
    private Double porcentajeCumplimientoSemanaAnterior;

    /** Días de la semana actual (1-7) donde SÍ hubo asistencia registrada */
    private List<Integer> diasEntrenadosSemana;

    /** Lista de evolución por ejercicio */
    private List<EvolucionEjercicioDTO> evolucionEjercicios;

    /** Estadísticas adicionales del socio */
    private Map<String, Object> estadisticas;
}