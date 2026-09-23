package com.pulse_gym.lb_common.dto;

import java.time.LocalDate;
import lombok.Data;

@Data
public class EquipoResponseDTO {
    
    private Long idEquipo;
    
    private String nombreEquipo;
    private String nombre; 

    private String marca;
    private String modelo;
    private String numeroSerie;
    private LocalDate fechaAdquisicion;
    private LocalDate fechaGarantia;
    private String ubicacion;
    private String descripcion;

    private String estado;
    private String urgenciaFalla;
    private String descripcionFalla;
    private String estadoReporte;

    private Long idSede;
    private String nombreSede;

    private Long idProveedor;
    private String nombreProveedor;
}