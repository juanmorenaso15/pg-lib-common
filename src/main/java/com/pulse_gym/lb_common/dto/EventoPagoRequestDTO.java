package com.pulse_gym.lb_common.dto;

import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class EventoPagoRequestDTO {

    /** Identificador del socio (ID interno) */
    private Long socioId;

    /** Monto del pago */
    private BigDecimal monto;

    /** Fecha y hora del pago */
    private LocalDateTime fechaPago;

    /** Tipo de membresía (ej. "Mensual", "Anual") */
    private String tipoMembresia;

    /** Método de pago (ej. "EFECTIVO", "TARJETA_CREDITO") */
    private String metodoPago;
}