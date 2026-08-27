package com.pulse_gym.lb_common.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class HistorialFisicoRequestDTO {

    /** ID del socio */
    @NotNull(message = "El ID del socio es obligatorio")
    private Long idSocio;

    /** ID del recepcionista */
    private Long idRecepcionista;

    /** Fecha de la medición */
    private LocalDateTime fechaMedicion;

    /** Peso en kg */
    @NotNull(message = "El peso es obligatorio")
    private BigDecimal pesoKg;

    private BigDecimal alturaCm;

    /** Porcentaje de grasa (Opcional, si es null se calcula automáticamente) */
    private BigDecimal porcentajeGrasa;

    /** Porcentaje de músculo (Opcional, si es null se calcula automáticamente) */
    private BigDecimal porcentajeMusculo;

    /** Cuello en cm */
    private BigDecimal cuelloCm;

    /** Cintura escapular en cm */
    private BigDecimal cinturaEscapularCm;

    /** Cintura en cm */
    private BigDecimal cinturaCm;

    /** Cadera en cm */
    private BigDecimal caderaCm;

    /** Tórax en cm */
    private BigDecimal toraxCm;

    /** Pecho en cm */
    private BigDecimal pechoCm;

    /** Brazo izquierdo en cm */
    private BigDecimal brazoIzqCm;

    /** Brazo derecho en cm */
    private BigDecimal brazoDerCm;

    /** Pierna izquierda en cm */
    private BigDecimal piernaIzqCm;

    /** Pierna derecha en cm */
    private BigDecimal piernaDerCm;

    /** Pantorrilla izquierda en cm */
    private BigDecimal pantorrillaIzqCm;

    /** Pantorrilla derecha en cm */
    private BigDecimal pantorrillaDerCm;
}