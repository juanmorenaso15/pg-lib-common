package com.pulse_gym.lb_common.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class RenovarMembresiaRequestDTO {
    
    /** ID de la asignación de membresía */
    @NotNull(message = "El ID de la asignación de membresía es obligatorio")
    private Long idSocioMembresia;

    /** Cantidad de días para renovación flexible (Opcional, si no se envía usa los días anteriores) */
    private Integer cantidadDias;
    
    /** Observaciones */
    private String observaciones;
}
