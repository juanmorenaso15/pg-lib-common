package com.pulse_gym.lb_common.dto;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class FiltroPagosRequestDTO {

    /** Número de página actual (por defecto 0) */
    private int page = 0;

    /** Tamaño de la página (por defecto 7 u 8) */
    private int size = 7;

    /**
     * Texto general para buscar por socio, plan o referencia (ignora
     * mayúsculas/minúsculas y espacios)
     */
    private String search;

    /** ID del socio para filtrar pagos (opcional) */
    private Long idSocio;

    /** Método de pago para filtrar */
    private String metodoPago;

    /** Tipo de pago o concepto */
    private String tipoPago;

    /** Filtra pagos anulados (opcional) */
    private Boolean anulado;

    /** Filtra por estado específico del pago */
    private String estado;

    /** Fecha de inicio */
    private LocalDateTime fechaInicio;

    /** Fecha de fin */
    private LocalDateTime fechaFin;
}