package com.pulse_gym.lb_common.dto;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Data;

@Data
public class RutinaExportacionDTO {

    /** ID de la rutina */
    private Long idRutina;

    /** Nombre de la rutina */
    private String nombre;

    /** Descripción de la rutina */
    private String descripcion;

    /** Explicación generada por IA */
    private String explicacionIA;

    /** Nombre del socio */
    private String nombreSocio;

    /** Apellido del socio */
    private String apellidoSocio;

    /** Email del socio */
    private String emailSocio;

    /** Fecha de generación de la rutina */
    private LocalDateTime fechaGeneracion;

    /** Versión de la rutina */
    private Integer version;

    /** Indica si fue generada por IA */
    private Boolean generadaPorIA;

    /** Lista de detalles de la rutina para exportación */
    private List<DetalleRutinaExportacionDTO> detalles;

}

/**
 * DTO para detalles de rutina en exportación
 */
@Data
class DetalleRutinaExportacionDTO {

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

    /** Lista de detalles de la rutina para exportación */
    private List<DetalleRutinaExportacionDTO> detalles;
}