package com.pulse_gym.lb_common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MembresiaIngresoDTO {
    /**
     * Nombre de la membresía
     */
    private String tipoMembresia;

    /**
     * Total de ingresos por membresía
     */
    private BigDecimal total;
}