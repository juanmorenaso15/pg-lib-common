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
public class DashboardEntrenadorDTO {
    
    /** ID del entrenador */
    private Long entrenadorId;

    /** Nombre completo del entrenador */
    private String nombreEntrenador;

    /** Total de socios activos asignados al entrenador */
    private long totalSociosActivos;

    /** Lista de evolución de los socios asignados */
    private List<SocioEvolucionDTO> sociosEvolucion;
}