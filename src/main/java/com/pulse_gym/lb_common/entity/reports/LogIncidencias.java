package com.pulse_gym.lb_common.entity.reports;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "log_incidencias")
@Data
public class LogIncidencias {

    /**
     * Identificador único de la incidencia
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_incidencia")
    private Long idIncidencia;

    /**
     * Tipo de dato que falló: ACCESO, PAGO, MAQUINA
     */
    @Column(name = "tipo_dato", nullable = false, length = 50)
    private String tipoDato;

    /**
     * Datos recibidos en formato JSON (para trazabilidad)
     */
    @Column(name = "datos_recibidos", columnDefinition = "TEXT")
    private String datosRecibidos;

    /**
     * Descripción del error (ej: "Campo socioId faltante")
     */
    @Column(name = "error_descripcion", nullable = false, columnDefinition = "TEXT")
    private String errorDescripcion;

    /**
     * Fecha y hora de la incidencia (se asigna automáticamente)
     */
    @Column(name = "fecha_incidencia", nullable = false, updatable = false)
    private LocalDateTime fechaIncidencia = LocalDateTime.now();
}