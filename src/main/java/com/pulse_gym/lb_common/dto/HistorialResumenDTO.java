package com.pulse_gym.lb_common.dto;

import java.time.LocalDateTime;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HistorialResumenDTO {
    
    /** */
    private long totalRecords;
    
    /** */
    private LocalDateTime primeraFecha;
    
    /** */
    private LocalDateTime ultimaFecha;
    
    /** */
    private List<SocioSimpleDTO> socios;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class SocioSimpleDTO {
        
        /** */
        private Long id;
        
        /** */
        private String nombre;
    }
}