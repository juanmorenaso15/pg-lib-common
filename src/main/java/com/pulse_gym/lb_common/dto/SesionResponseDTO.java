package com.pulse_gym.lb_common.dto;

import java.time.LocalDateTime;
import java.util.List;

import com.pulse_gym.lb_common.enums.EnumEstadoSesion;

import lombok.Data;

@Data
public class SesionResponseDTO {

    /** ID de la sesión */
    private Long idSesion;

    /** ID del socio que realizó la sesión */
    private Long idSocio;

    /** Nombre del socio */
    private String nombreSocio;

    /** ID de la rutina asociada */
    private Long idRutina;

    /** Nombre de la rutina */
    private String nombreRutina;

    /** Fecha y hora de la sesión */
    private LocalDateTime fechaSesion;

    /** Duración en minutos */
    private Integer duracionMinutos;

    /** Estado de la sesión (COMPLETADA, PARCIAL, NO_REALIZADA) */
    private EnumEstadoSesion estado;

    /** Lista de ejercicios realizados en la sesión */
    private List<DetalleSesionResponseDTO> detalles;
}