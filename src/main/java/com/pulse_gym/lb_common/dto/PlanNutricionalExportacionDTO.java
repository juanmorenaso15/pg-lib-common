package com.pulse_gym.lb_common.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class PlanNutricionalExportacionDTO {

    /** ID del plan nutricional */
    private Long idPlan;

    /** Nombre del socio */
    private String nombreSocio;

    /** Apellido del socio */
    private String apellidoSocio;

    /** Email del socio */
    private String emailSocio;

    /** Fecha de generación del plan */
    private LocalDateTime fechaGeneracion;

    /** Versión del plan */
    private Integer version;

    /** Indica si fue generado por IA */
    private Boolean generadoPorIA;

    /** Calorías diarias recomendadas */
    private Integer caloriasDiarias;

    /** Gramos de proteína diarios */
    private Double proteinasG;

    /** Gramos de carbohidratos diarios */
    private Double carbohidratosG;

    /** Gramos de grasas diarios */
    private Double grasasG;

    /** Restricciones dietéticas aplicadas */
    private String restriccionesDieteticas;

    /** Explicación generada por IA sobre el plan */
    private String explicacionIA;

    /** Sugerencias de comidas agrupadas por tipo */
    private Map<String, List<SugerenciaComidaExportacionDTO>> sugerenciasComidas;

}

/**
 * DTO para sugerencias de comida en exportación
 */
@Data
class SugerenciaComidaExportacionDTO {

    /** Nombre de la comida */
    private String nombre;

    /** Descripción de la comida */
    private String descripcion;

    /** Calorías de la comida */
    private Integer calorias;

    /** Ingredientes de la comida */
    private String ingredientes;

    /** Preparación de la comida */
    private String preparacion;

    /** Gramos de proteína */
    private Double proteinas;

    /** Gramos de carbohidratos */
    private Double carbohidratos;

    /** Gramos de grasas */
    private Double grasas;
}