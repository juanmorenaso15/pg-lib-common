package com.pulse_gym.lb_common.dto;

import java.util.Map;

import com.pulse_gym.lb_common.enums.EnumEventoAsociado;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * Dispara un evento de notificacion hacia TODOS los usuarios del sistema que
 * tengan un numero de telefono registrado (usado, por ejemplo, para avisar a
 * todo el mundo cuando un equipo se daña o entra en mantenimiento), en vez de
 * a un unico usuario como EnvioEventoNotificacionDTO.
 */
@Data
public class EnvioEventoMasivoDTO {

    /**
     * Evento que dispara la notificacion
     */
    @NotNull(message = "El evento es obligatorio")
    private EnumEventoAsociado evento;

    /**
     * Variables adicionales para la plantilla
     */
    private Map<String, Object> variablesAdicionales;
}
