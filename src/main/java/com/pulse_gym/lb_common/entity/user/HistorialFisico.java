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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "historial_fisico")
public class HistorialFisico {

    /** ID del historial físico */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_historial_fisico")
    private Long idHistorialFisico;

    /** Usuario socio */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_id_usuario_socio", nullable = false)
    private UsuarioPerfil socio;

    /** Usuario recepcionista */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_id_usuario_recepcionista")
    private UsuarioPerfil recepcionista;

    /** Fecha de la medición */
    @Column(name = "fecha_medicion", nullable = false)
    private LocalDateTime fechaMedicion;

    /** Peso en kg */
    @Column(name = "peso_kg", precision = 10, scale = 2)
    private BigDecimal pesoKg;

    /** Altura en cm */
    @Column(name = "altura_cm", precision = 10, scale = 2)
    private BigDecimal alturaCm;

    /** Porcentaje de grasa */
    @Column(name = "porcentaje_grasa", precision = 5, scale = 2)
    private BigDecimal porcentajeGrasa;

    /** Porcentaje de músculo */
    @Column(name = "porcentaje_musculo", precision = 5, scale = 2)
    private BigDecimal porcentajeMusculo;

    /** Cuello en cm */
    @Column(name = "cuello_cm", precision = 10, scale = 2)
    private BigDecimal cuelloCm;

    /** Cintura escapular en cm */
    @Column(name = "cintura_escapular_cm", precision = 10, scale = 2)
    private BigDecimal cinturaEscapularCm;

    /** Cintura en cm */
    @Column(name = "cintura_cm", precision = 10, scale = 2)
    private BigDecimal cinturaCm;

    /** Cadera en cm */
    @Column(name = "cadera_cm", precision = 10, scale = 2)
    private BigDecimal caderaCm;

    /** Tórax en cm */
    @Column(name = "torax_cm", precision = 10, scale = 2)
    private BigDecimal toraxCm;

    /** Pecho en cm */
    @Column(name = "pecho_cm", precision = 10, scale = 2)
    private BigDecimal pechoCm;

    /** Brazo izquierdo en cm */
    @Column(name = "brazo_izq_cm", precision = 10, scale = 2)
    private BigDecimal brazoIzqCm;

    /** Brazo derecho en cm */
    @Column(name = "brazo_der_cm", precision = 10, scale = 2)
    private BigDecimal brazoDerCm;

    /** Pierna izquierda en cm */
    @Column(name = "pierna_izq_cm", precision = 10, scale = 2)
    private BigDecimal piernaIzqCm;

    /** Pierna derecha en cm */
    @Column(name = "pierna_der_cm", precision = 10, scale = 2)
    private BigDecimal piernaDerCm;

    /** Pantorrilla izquierda en cm */
    @Column(name = "pantorrilla_izq_cm", precision = 10, scale = 2)
    private BigDecimal pantorrillaIzqCm;

    /** Pantorrilla derecha en cm */
    @Column(name = "pantorrilla_der_cm", precision = 10, scale = 2)
    private BigDecimal pantorrillaDerCm;

    /** Acción antes de persistir */
    @PrePersist
    protected void onCreate() {
        if (fechaMedicion == null) {
            fechaMedicion = LocalDateTime.now();
        }
    }
}