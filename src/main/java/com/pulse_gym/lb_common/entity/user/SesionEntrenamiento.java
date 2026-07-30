package com.pulse_gym.lb_common.entity.user;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "sesion_entrenamiento")
@Data
public class SesionEntrenamiento {

    /** Identificador único de la sesión de entrenamiento */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sesion")
    private Long idSesion;

    /** Socio que realiza la sesión */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_id_socio", nullable = false)
    private UsuarioPerfil socio;

    /** Rutina asociada a la sesión (opcional) */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_id_rutina_ia")
    private RutinaIA rutina;

    /** Fecha y hora de la sesión */
    @Column(name = "fecha_sesion", nullable = false)
    private LocalDateTime fechaSesion;

    /** Duración de la sesión en minutos */
    @Column(name = "duracion_minutos", nullable = false)
    private Integer duracionMinutos;

    /** Estado de la sesión (ej: COMPLETADA, PENDIENTE, CANCELADA) */
    @Column(name = "estado", nullable = false)
    private String estado;

    /** Observaciones adicionales sobre la sesión */
    @Column(name = "observaciones", columnDefinition = "TEXT")
    private String observaciones;

    /** Lista de ejercicios realizados en la sesión */
    @OneToMany(mappedBy = "sesion", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DetalleSesionEjercicio> detalles = new ArrayList<>();

    /** Establece la fecha de la sesión antes de persistir */
    @PrePersist
    protected void onCreate() {
        fechaSesion = LocalDateTime.now();
    }
}