package com.pulse_gym.lb_common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SocioEvolucionDTO {

    /** ID del socio */
    private Long socioId;

    /** Nombre completo del socio */
    private String nombreSocio;

    /** Lista de mediciones históricas del socio */
    private List<EvolucionDiariaDTO> evolucionHistorica;
}