package com.pulse_gym.lb_common.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SocioAsignadoDTO {
    
    /** ID del socio */
    private Long idSocio;
    
    /** Nombre completo del socio */
    private String nombreCompleto;
    
    /** Email del socio */
    private String email;
    
    /** Teléfono del socio */
    private String telefono;
    
    /** ID de la asignación (SocioMembresia) */
    private Long idSocioMembresia;
    
    /** Fecha de inicio de la membresía */
    private LocalDate fechaInicio;
    
    /** Fecha de vencimiento de la membresía */
    private LocalDate fechaVencimiento;
    
    /** Estado de la membresía del socio */
    private String estado;
    
    /** Días restantes de la membresía */
    private Long diasRestantes;
    
    /** Observaciones de la asignación */
    private String observaciones;
    
    /** Fecha de creación de la asignación */
    private LocalDateTime fechaCreacion;
}