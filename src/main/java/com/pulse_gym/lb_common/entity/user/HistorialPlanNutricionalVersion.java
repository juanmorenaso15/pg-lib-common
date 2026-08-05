package com.pulse_gym.lb_common.entity.user;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "historial_plan_nutricional_version")
@Data
public class HistorialPlanNutricionalVersion {

    /** Identificador único del historial */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_historial")
    private Long idHistorial;

    /** Plan nutricional al que pertenece este historial */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_id_plan_nutricional", nullable = false)
    private PlanNutricionalIA planNutricional;

    /** Versión del plan en este historial */
    @Column(name = "version", nullable = false)
    private Integer version;

    /** Datos del plan en formato JSON */
    @Column(name = "datos_json", nullable = false, columnDefinition = "TEXT")
    private String datosJson;

    /** Nombre del usuario que realizó la modificación */
    @Column(name = "modificado_por_nombre", length = 255)
    private String modificadoPorNombre;

    /** Usuario que realizó la modificación */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_id_modificado_por")
    private UsuarioPerfil modificadoPor;

    /** Fecha de la modificación */
    @Column(name = "fecha_modificacion", nullable = false)
    private LocalDateTime fechaModificacion;

    /** Motivo de la modificación */
    @Column(name = "motivo", length = 255)
    private String motivo;

    @PrePersist
    protected void onCreate() {
        fechaModificacion = LocalDateTime.now();
    }
}