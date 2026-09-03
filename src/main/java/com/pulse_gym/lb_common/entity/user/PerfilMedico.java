package com.pulse_gym.lb_common.entity.user;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data
@Table(name = "perfil_medico")
public class PerfilMedico {

    /** Identificador único del perfil médico */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_perfil_medico")
    private Long idPerfilMedico;

    /**
     * Relación bidireccional: Excluida para evitar recursión en hashCode y toString
     */
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_id_usuario", nullable = false, unique = true)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private UsuarioPerfil socio;

    /** Peso del socio en kilogramos */
    @Column(name = "peso_kg", precision = 10, scale = 2)
    private BigDecimal pesoKg;

    /** Estatura del socio en centímetros */
    @Column(name = "estatura_cm")
    private Short estaturaCm;

    /** Alergias del socio */
    @Column(name = "alergias", columnDefinition = "TEXT")
    private String alergias;

    /** Condiciones crónicas del socio */
    @Column(name = "condiciones_cronicas", columnDefinition = "TEXT")
    private String condicionesCronicas;

    /** Lesiones previas del socio */
    @Column(name = "lesiones_previas", columnDefinition = "TEXT")
    private String lesionesPrevias;

    /** Porcentaje de grasa corporal */
    @Column(name = "porcentaje_grasa", precision = 5, scale = 2)
    private BigDecimal porcentajeGrasa;

    /** Estado activo para soporte de soft delete */
    @Column(name = "activo", nullable = false)
    private Boolean activo = true;

    /** Fecha de última actualización del perfil médico */
    @Column(name = "fecha_actualizacion", nullable = false)
    private LocalDateTime fechaActualizacion;

    /** Actualiza la fecha de modificación antes de persistir o actualizar */
    @PrePersist
    @PreUpdate
    protected void onUpdate() {
        fechaActualizacion = LocalDateTime.now();
        if (activo == null) {
            activo = true;
        }
    }
}