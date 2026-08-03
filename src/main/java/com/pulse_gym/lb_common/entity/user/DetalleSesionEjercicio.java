package com.pulse_gym.lb_common.entity.user;

import java.math.BigDecimal;

import com.pulse_gym.lb_common.enums.EnumEstadoEjecucionEjercicio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "detalle_sesion_ejercicio")
@Data
public class DetalleSesionEjercicio {

    /** Identificador único del detalle de sesión */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detalle_sesion")
    private Long idDetalleSesion;

    /** Sesión a la que pertenece este detalle */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_id_sesion", nullable = false)
    private SesionEntrenamiento sesion;

    /** Detalle de rutina asociado a este ejercicio */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_id_detalle_rutina", nullable = false)
    private DetalleRutina detalleRutina;

    /** Número de series completadas en la sesión */
    @Column(name = "series_completadas", nullable = false)
    private Integer seriesCompletadas;

    /** Número de repeticiones realizadas */
    @Column(name = "repeticiones_realizadas")
    private Integer repeticionesRealizadas;

    /** Peso utilizado en la sesión */
    @Column(name = "peso_usado", precision = 10, scale = 2)
    private BigDecimal pesoUsado;

    /** Estado del detalle (ej: COMPLETADO, PENDIENTE) */
    @Enumerated(EnumType.STRING)
    @Column(name = "estado", nullable = false, length = 20)
    private EnumEstadoEjecucionEjercicio estado;

    /** Observaciones adicionales sobre el ejercicio */
    @Column(name = "observaciones", columnDefinition = "TEXT")
    private String observaciones;
}