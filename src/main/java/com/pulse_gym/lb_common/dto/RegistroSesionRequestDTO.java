package com.pulse_gym.lb_common.dto;

import java.util.List;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class RegistroSesionRequestDTO {

    /** ID del socio que realiza la sesión */
    @NotNull(message = "El ID del socio es obligatorio")
    private Long idSocio;

    /** ID de la rutina asociada (opcional) */
    private Long idRutina;

    /** Duración de la sesión en minutos */
    @NotNull(message = "La duración en minutos es obligatoria")
    private Integer duracionMinutos;

    /** Lista de ejercicios realizados en la sesión */
    private List<DetalleEjercicioSesionDTO> detalles;

    /** Observaciones adicionales sobre la sesión */
    private String observaciones;
}
