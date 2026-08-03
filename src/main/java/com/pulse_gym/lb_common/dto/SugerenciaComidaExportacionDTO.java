package com.pulse_gym.lb_common.dto;

import lombok.Data;

@Data
public class SugerenciaComidaExportacionDTO {

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