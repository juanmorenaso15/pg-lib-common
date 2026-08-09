package com.pulse_gym.lb_common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SocioMoraDTO {

    /**
     * id del socio
     */
    private Long idSocio;

    /**
     * nombre completo del socio
     */
    private String nombreCompleto;

    /**
     * identificacion del socio
     */
    private String identificacion; 

    /**
     * telefono del socio
     */
    private String telefono;

    /**
     * email del socio
     */
    private String email;

    /**
     * tipo de membresia del socio
     */
    private String tipoMembresia;

    /**
     * estado de la membresia del socio
     */
    private String estadoMembresia; 

    /**
     * fecha de vencimiento de la membresia del socio
     */
    private String fechaVencimiento; 

    /**
     * dias vencido de la membresia del socio
     */
    private Long diasVencido; 
}