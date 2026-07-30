package com.pulse_gym.lb_common.dto;

import java.math.BigDecimal;
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

    /** Lista de evolución por ejercicio */
    private List<EvolucionEjercicioDTO> evolucionEjercicios;

    /** Estadísticas adicionales del socio */
    private Map<String, Object> estadisticas;
}

/**
 * DTO interno para la evolución de un ejercicio específico.
 * El estado puede ser: PROGRESO, ESTANCADO, RETROCESO.
 */
@Data
class EvolucionEjercicioDTO {

    /** Nombre del ejercicio */
    private String nombreEjercicio;

    /** Progreso medido en porcentaje o valor */
    private BigDecimal progreso;

    /** Estado del progreso (PROGRESO, ESTANCADO, RETROCESO) */
    private String estado;
}
