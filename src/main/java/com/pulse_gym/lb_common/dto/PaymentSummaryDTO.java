package com.pulse_gym.lb_common.dto;

import lombok.Data;

@Data
public class PaymentSummaryDTO {
    /** Total de ingresos del mes actual */
    private Double ingresosMes;
    
    /** Cantidad de pagos realizados este mes */
    private Integer pagosEsteMes;
    
    /** Cantidad de pagos pendientes */
    private Integer pendientesCount;
    
    /** Cantidad de pagos o membresías vencidas */
    private Integer vencidosCount;
    
    /** Cantidad total de pagos completados / aprobados */
    private Integer completadosCount;
}