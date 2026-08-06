package com.pulse_gym.lb_common.dto;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class PlanNutricionalAjusteRequestDTO {

 /** Calorías diarias recomendadas (opcional) */
    private Integer caloriasDiarias;

    /** Gramos de proteína diarios (opcional) */
    private BigDecimal proteinasG;

    /** Gramos de carbohidratos diarios (opcional) */
    private BigDecimal carbohidratosG;

    /** Gramos de grasas diarios (opcional) */
    private BigDecimal grasasG;

    /** Restricciones dietéticas aplicadas (opcional) */
    private List<String> restriccionesDieteticas;

    /** Sugerencias de comidas por tipo (opcional) */
    private Map<String, List<SugerenciaComidaDTO>> sugerenciasComidas;

    /** Explicación generada por IA sobre el plan (opcional) */
    private String explicacionIA;

    /** Motivo de la modificación */
    private String motivo;
}