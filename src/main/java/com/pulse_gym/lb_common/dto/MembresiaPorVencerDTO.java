package com.pulse_gym.lb_common.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MembresiaPorVencerDTO {

    /** ID de la relación socio-membresía */
    private Long idSocioMembresia;

    /** ID del socio */
    private Long idSocio;

    /** Nombre completo del socio */
    private String nombreSocio;

    /** Email del socio */
    private String emailSocio;

    /** Teléfono de contacto del socio */
    private String telefono;

    /** ID de la membresía */
    private Long idMembresia;

    /** Nombre de la membresía */
    private String nombreMembresia;

    /** Fecha de vencimiento de la membresía */
    private LocalDate fechaVencimiento;

    /** Días restantes antes del vencimiento */
    private Integer diasRestantes;

    /** Estado de la membresía (ACTIVA, VENCIDA, SUSPENDIDA) */
    private String estado;

    /** Nivel de urgencia (BAJA, MEDIA, ALTA, CRÍTICA) */
    private String urgencia;

    /** URL del avatar del socio */
    private String avatarUrl;
}