package com.pulse_gym.lb_common.dto;

import java.math.BigDecimal;
import java.util.List;

import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MembresiaConSociosDTO {
    
    /** ID de la membresía */
    private Long idMembresia;
    
    /** Nombre de la membresía */
    private String nombre;
    
    /** Precio total de la membresía */
    private BigDecimal precioTotal;
    
    /** Cantidad de la membresía */
    private Integer cantidad;
    
    /** Tipo de duración */
    private String tipoDuracion;
    
    /** Descripción de la duración */
    private String duracionDescripcion;
    
    /** Indica si incluye IA */
    private Boolean incluyeIA;
    
    /** Indica si es flexible */
    private Boolean esFlexible;
    
    /** Precio por día (para membresías flexibles) */
    private BigDecimal precioPorDia;
    
    /** Beneficios de la membresía */
    private String beneficios;
    
    /** Restricciones de la membresía */
    private String restricciones;
    
    /** Indica si está activa */
    private Boolean activo;
    
    /** Lista de socios que tienen esta membresía */
    private List<SocioAsignadoDTO> sociosAsignados;
    
    /** Total de socios asignados */
    private Integer totalSociosAsignados;
}