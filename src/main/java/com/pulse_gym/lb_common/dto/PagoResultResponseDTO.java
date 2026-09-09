// pg-lib-common/src/main/java/com/pulse_gym/lb_common/dto/PagoResultResponseDTO.java
package com.pulse_gym.lb_common.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PagoResultResponseDTO {

    /** ID local del pago registrado en la base de datos */
    private Long idPago;

    /** Estado devuelto por Mercado Pago: approved, rejected, in_process, pending */
    private String status;

    /** Detalle del estado (ej: accredited, cc_rejected_insufficient_amount, etc.) */
    private String statusDetail;

    /** ID del pago real en Mercado Pago */
    private String paymentIdMp;

    /** Monto cobrado */
    private BigDecimal monto;

    /** Mensaje amigable para mostrar al usuario */
    private String mensaje;
}