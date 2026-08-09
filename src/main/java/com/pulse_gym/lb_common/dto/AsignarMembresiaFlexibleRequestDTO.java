package com.pulse_gym.lb_common.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class AsignarMembresiaFlexibleRequestDTO {
    
    /** ID del socio al que se asignará la membresía */
    @NotNull(message = "El ID del socio es obligatorio")
    private Long idSocio;

    /** ID de la membresía a asignar */
    @NotNull(message = "El ID de la membresía es obligatorio")
    private Long idMembresia;

    /** Cantidad de días de duración de la membresía */
    @NotNull(message = "La cantidad de días es obligatoria")
    @Min(value = 1, message = "La cantidad de días debe ser al menos 1")
    private Integer cantidadDias;

    /** Observaciones adicionales sobre la asignación */
    private String observaciones;
}