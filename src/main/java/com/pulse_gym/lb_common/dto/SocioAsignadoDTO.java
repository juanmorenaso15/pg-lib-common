package com.pulse_gym.lb_common.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SocioAsignadoDTO {
    
    /** ID de la relación socio-membresía */
    private Long idSocioMembresia;

    /** ID del socio */
    private Long idSocio;

    /** Nombre completo del socio */
    private String nombreCompleto;

    /** Email del socio */
    private String email;

    /** Teléfono del socio */
    private String telefono;

    /** Precio total de la membresía */
    private BigDecimal precioTotal;

    /** Precio real aplicado */
    private BigDecimal precioReal;

    /** Precio por día (para membresías flexibles) */
    private BigDecimal precioPorDia;

    /** Indica si la membresía es flexible */
    private Boolean esFlexible;

    /** Cantidad de días (para membresías flexibles) */
    private Integer cantidadDias;

    /** Descripción del tipo de membresía */
    private String tipoMembresiaDescripcion;

    /** Fecha de inicio de la membresía */
    private LocalDate fechaInicio;

    /** Fecha de vencimiento de la membresía */
    private LocalDate fechaVencimiento;

    /** Estado de la membresía (ACTIVA, VENCIDA, SUSPENDIDA) */
    private String estado;

    /** Días restantes antes del vencimiento */
    private Long diasRestantes;

    /** Indica si la membresía está activa */
    private Boolean estaActiva;

    /** Indica si la membresía está vencida */
    private Boolean estaVencida;

    /** Observaciones adicionales */
    private String observaciones;

    /** Fecha de creación del registro */
    private LocalDateTime fechaCreacion;

    /** Fecha de última actualización */
    private LocalDateTime fechaActualizacion;
}