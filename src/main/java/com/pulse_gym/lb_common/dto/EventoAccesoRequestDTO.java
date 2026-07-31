package com.pulse_gym.lb_common.dto;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class EventoAccesoRequestDTO {

    /** ID del socio (identificador numérico) */
    private Long socioId;

    /** Fecha y hora del evento (se puede tomar de la asistencia) */
    private LocalDateTime fechaHora;

    /** Tipo de acceso: WEB, APP, BIOMETRICO */
    private String tipoAcceso;

    /**
     * Indica si fue entrada o salida (por ahora solo entrada, pero dejamos campo)
     */
    private String tipoEvento; // "ENTRADA" o "SALIDA"
}