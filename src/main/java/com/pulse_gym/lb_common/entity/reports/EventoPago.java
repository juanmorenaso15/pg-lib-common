package com.pulse_gym.lb_common.entity.reports;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "evento_pago", indexes = {
    @Index(name = "idx_evento_pago_fecha", columnList = "fecha_pago"),
    @Index(name = "idx_evento_pago_socio", columnList = "socio_identificador")
})
public class EventoPago {
    
    /**
     * Identificador único del evento de pago
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_evento_pago")
    private Long idEventoPago;

    /**
     * Identificador del socio (varchar 255)
     */
    @Column(name = "socio_identificador", length = 255)
    private String socioIdentificador;

    /**
     * Monto pagado (numeric 38,2)
     */
    @Column(name = "monto", precision = 38, scale = 2)
    private BigDecimal monto;

    /**
     * Fecha de pago
     */
    @Column(name = "fecha_pago")
    private LocalDateTime fechaPago;

    /**
     * Tipo de membresía asociada (varchar 255)
     */
    @Column(name = "tipo_membresia", length = 255)
    private String tipoMembresia;

    /**
     * Método de pago utilizado (varchar 255)
     */
    @Column(name = "metodo_pago", length = 255)
    private String metodoPago;

    /** 
     * Indica si el evento de pago ha sido anulado  
     */
    @Column(name = "anulado")
    private Boolean anulado = false;

    /**
     * Asegura valores por defecto antes de persistir
     */
    @PrePersist
    protected void onCreate() {
        if (anulado == null) {
            anulado = false;
        }
    }
}