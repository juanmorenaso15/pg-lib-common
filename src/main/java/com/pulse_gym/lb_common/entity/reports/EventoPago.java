package com.pulse_gym.lb_common.entity.reports;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
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
     * Identidficador unico del evento
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_evento_pago")
    private Long idEventoPago;

    /**
     * Identidicador del socio
     */
    @Column(name = "socio_identificador")
    private String socioIdentificador;

    /**
     * Monto pagado
     */
    @Column(name = "monto")
    private BigDecimal monto;

    /**
     * Fecha de pago
     */
    @Column(name = "fecha_pago")
    private LocalDateTime fechaPago;

    /**
     * Tipo de membresia
     */
    @Column(name = "tipo_membresia")
    private String tipoMembresia;

    /**
     * Fecha de registro del sistema
     */
    @Column(name = "metodo_pago")
    private String metodoPago;

    /** Indica si el evento de pago ha sido anulado  */
    @Column(name = "anulado")
    private Boolean anulado = false;
}
