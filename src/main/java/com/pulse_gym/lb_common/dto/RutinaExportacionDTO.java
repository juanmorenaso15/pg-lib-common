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

    /** Usuario que modificó la rutina por última vez */
    private String modificadoPor;

    /** Fecha de la última modificación */
    private LocalDateTime fechaModificacion;

    /** Motivo de la última modificación */
    private String motivoModificacion;

}