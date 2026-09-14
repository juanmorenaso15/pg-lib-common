package com.pulse_gym.lb_common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SocioSimpleDTO {

    /** ID del usuario */
    private Long idUsuario;

    /** Nombre del socio */
    private String nombre;

    /** Apellido del socio */
    private String apellido;

    /** Email del socio */
    private String email;

    /** Teléfono de contacto del socio */
    private String telefono;
}