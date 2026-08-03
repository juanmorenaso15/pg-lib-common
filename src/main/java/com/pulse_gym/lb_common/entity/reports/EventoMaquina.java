package com.pulse_gym.lb_common.entity.reports;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.pulse_gym.lb_common.enums.EnumEstado;

@Entity
@Table(name = "evento_maquina")
@Data
public class EventoMaquina {
    
    /**
     * Identificador único del evento de la máquina
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_evento_maquina")
    private Long idEventoMaquina;

    /**
     * Nombre de la máquina
     */
    @Column(name = "nombre_maquina", nullable = false, length = 100)
    private String nombreMaquina;

    /**
     * Estado de la máquina
     */
    @Enumerated(EnumType.STRING)
    @Column(name = "estado", nullable = false, length = 50)
    private EnumEstado estado;

    /**
     * Fecha del reporte del evento
     */
    @Column(name = "fecha_reporte", nullable = false)
    private LocalDate fechaReporte;

    /**
     * Descripción del problema
     */
    @Column(name = "descripcion_problema", columnDefinition = "TEXT")
    private String descripcionProblema;

    /**
     * Fecha de reparación de la máquina (si aplica)
     */
    @Column(name = "fecha_reparacion")
    private LocalDate fechaReparacion;

    /**
     * Fecha de registro del evento en la base de datos
     */
    @Column(name = "fecha_registro", nullable = false, updatable = false)
    private LocalDateTime fechaRegistro = LocalDateTime.now();
}