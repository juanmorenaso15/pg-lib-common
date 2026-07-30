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
@Table(name = "entrenador_socio")
@Data
public class EntrenadorSocio {

    /** Identificador único de la asignación entrenador-socio */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_entrenador_socio")
    private Long idEntrenadorSocio;

    /** Entrenador asignado */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_id_entrenador", nullable = false)
    private UsuarioPerfil entrenador;

    /** Socio asignado al entrenador */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_id_socio", nullable = false)
    private UsuarioPerfil socio;

    /** Fecha de asignación del entrenador al socio */
    @Column(name = "fecha_asignacion", nullable = false)
    private LocalDateTime fechaAsignacion;

    /** Indica si la asignación está activa */
    @Column(name = "activa")
    private Boolean activa = true;

    /** Establece la fecha de asignación antes de persistir */
    @PrePersist
    protected void onCreate() {
        fechaAsignacion = LocalDateTime.now();
    }
}
