package com.pulse_gym.lb_common.dto;

import lombok.Data;

@Data
public class DetalleRutinaExportacionDTO {

    /** Nombre del ejercicio */
    private String nombreEjercicio;

    /** Grupo muscular del ejercicio */
    private String grupoMuscular;

    /** Día de la semana (1-7) */
    private Integer diaSemana;

    /** Orden de ejecución */
    private Integer orden;

    /** Número de series */
    private Integer series;

    /** Repeticiones mínimas */
    private Integer repeticionesMin;

    /** Repeticiones máximas */
    private Integer repeticionesMax;

    /** Peso sugerido (formateado como string) */
    private String pesoSugerido;

    /** Tiempo de descanso en segundos */
    private Integer descansoSegundos;

    /** Notas adicionales */
    private String notas;

    /** URL de la imagen del ejercicio */
    private String urlImagen;
}