package com.pulse_gym.lb_common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegistroCompletoSocioResponseDTO {

    /** Mensaje de confirmación del registro */
    private String mensaje;

    /** Datos del perfil del socio registrado */
    private UsuarioPerfilResponseDTO perfil;

    /** Datos de la membresía asignada al socio */
    private SocioMembresiaResponseDTO membresia;

    /** Indica si la huella biométrica fue registrada exitosamente */
    private Boolean huellaRegistrada;
}