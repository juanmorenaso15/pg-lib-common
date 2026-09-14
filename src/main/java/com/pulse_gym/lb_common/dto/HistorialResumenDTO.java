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

    /** Total de registros en el historial */
    private long totalRecords;

    /** Fecha del primer registro */
    private LocalDateTime primeraFecha;

    /** Fecha del último registro */
    private LocalDateTime ultimaFecha;

    /** Lista de socios incluidos en el resumen */
    private List<SocioSimpleDTO> socios;

    /**
     * DTO interno con datos básicos de un socio
     */
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class SocioSimpleDTO {

        /** ID del socio */
        private Long id;

        /** Nombre completo del socio */
        private String nombre;

        /** Teléfono de contacto del socio */
        private String telefono;
    }
}