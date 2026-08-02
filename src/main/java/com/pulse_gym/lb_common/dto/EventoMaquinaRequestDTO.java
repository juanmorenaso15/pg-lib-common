package com.pulse_gym.lb_common.dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class EventoMaquinaRequestDTO {

    /** Nombre de la máquina */
    private String nombreMaquina;

    /** Estado de la máquina: OPERATIVA, DAÑADA, EN_MANTENIMIENTO */
    private String estado;

    /** Fecha del reporte */
    private LocalDate fechaReporte;

    /** Descripción del problema (opcional) */
    private String descripcionProblema;

    /** Fecha de reparación (si aplica) */
    private LocalDate fechaReparacion;
}