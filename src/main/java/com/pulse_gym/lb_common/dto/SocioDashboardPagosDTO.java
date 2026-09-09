package com.pulse_gym.lb_common.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import lombok.Data;

@Data
public class SocioDashboardPagosDTO {

    /** ID del socio */
    private Long socioId;

    /** Nombre completo del socio */
    private String nombreSocio;

    /** Email del socio */
    private String emailSocio;

    /** Resumen de la membresía actual del socio */
    private SocioMembresiaResumenDTO membresiaActual;

    /** Historial de pagos del socio */
    private List<PagoResponseDTO> historialPagos;

    @Data
    public static class SocioMembresiaResumenDTO {

        /** ID de la relación socio-membresía */
        private Long idSocioMembresia;

        /** ID de la membresía */
        private Long idMembresia;

        /** Nombre de la membresía */
        private String nombreMembresia;

        /** Precio real pagado */
        private BigDecimal precioReal;

        /** Fecha de inicio de la membresía */
        private LocalDate fechaInicio;

        /** Fecha de vencimiento de la membresía */
        private LocalDate fechaVencimiento;

        /** Estado de la membresía (ACTIVA, VENCIDA, SUSPENDIDA) */
        private String estado;

        /** Cantidad de días (para membresías flexibles) */
        private Integer cantidadDias;
    }
}