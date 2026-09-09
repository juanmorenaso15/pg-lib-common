// pg-lib-common/src/main/java/com/pulse_gym/lb_common/dto/TokenizedPaymentRequestDTO.java
package com.pulse_gym.lb_common.dto;

import java.math.BigDecimal;

import com.pulse_gym.lb_common.enums.EnumMetodoPago;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Min;
import lombok.Data;

@Data
public class TokenizedPaymentRequestDTO {

    /** ID de la membresía asignada a la que se aplicará el pago */
    @NotNull(message = "El ID de la membresía asignada es obligatorio")
    private Long idSocioMembresia;

    /** Token de la tarjeta generado por el SDK JS de Mercado Pago (Payment Brick) */
    @NotBlank(message = "El token de la tarjeta es obligatorio")
    private String token;

    /** ID del método de pago (ej: "visa", "master") entregado por el Brick */
    @NotBlank(message = "El payment_method_id es obligatorio")
    private String paymentMethodId;

    /** ID del emisor de la tarjeta, entregado por el Brick */
    private String issuerId;

    /** Número de cuotas seleccionado por el usuario */
    @NotNull(message = "El número de cuotas es obligatorio")
    @Min(value = 1, message = "Las cuotas deben ser al menos 1")
    private Integer installments;

    /** Tipo de documento del pagador (ej: CC, CE, NIT) */
    @NotBlank(message = "El tipo de documento del pagador es obligatorio")
    private String payerIdentificationType;

    /** Número de documento del pagador */
    @NotBlank(message = "El número de documento del pagador es obligatorio")
    private String payerIdentificationNumber;

    /** Email del pagador */
    @NotBlank(message = "El email del pagador es obligatorio")
    private String payerEmail;

    /** Monto manual, opcional (para membresías flexibles) */
    private BigDecimal monto;

    /** Cantidad de días a sumar, opcional (para membresías flexibles) */
    private Integer cantidadDias;

    /** Método de pago seleccionado explícitamente en la interfaz (TARJETA_CREDITO / TARJETA_DEBITO) */
    private EnumMetodoPago metodoPago;
}