package com.pulse_gym.lb_common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;

@Data
@AllArgsConstructor
public class RespuestaPaginadaDTO<T> {
    /**
     * Contenido de la página actual.
     */
    private List<T> contenido;
    
    /**
     * Número de la página actual (0-indexado).
     */
    private int numeroPagina;
    
    /**
     * Tamaño de la página.
     */
    private int tamanioPagina;
    
    /**
     * Total de elementos.
     */ 
    private long totalElementos;
    
    /**
     * Total de páginas.
     */
    private int totalPaginas;

    /**
     * Indica si es la primera página.
     */
    private boolean ultima;
}