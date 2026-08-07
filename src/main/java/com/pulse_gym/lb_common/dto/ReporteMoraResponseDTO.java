package com.pulse_gym.lb_common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReporteMoraResponseDTO {

    /**
     * lista de socios en mora
     */
    private List<SocioMoraDTO> sociosEnMora;
    
    /**
     * total de socios en mora
     */
    private int totalMorosos;
    
    /**
     * mensaje de respuesta
     */
    private String mensaje;
}