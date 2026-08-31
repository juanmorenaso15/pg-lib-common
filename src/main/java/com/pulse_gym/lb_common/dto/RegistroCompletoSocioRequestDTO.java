package com.pulse_gym.lb_common.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class RegistroCompletoSocioRequestDTO {

    /** Datos del perfil del socio a completar */
    @Valid
    @NotNull(message = "Los datos del perfil son obligatorios")
    private CompletarPerfilRequestDTO perfil;

    /** Asignación de membresía estándar (opcional) */
    private AsignarMembresiaRequestDTO asignacionMembresia;

    /** Asignación de membresía flexible por días (opcional) */
    private AsignarMembresiaFlexibleRequestDTO asignacionMembresiaFlexible;

    /** ID del dispositivo biométrico para registro de huella (opcional) */
    private String biometricDeviceId;
}