package com.pulse_gym.lb_common.util;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class FechaUtils {

    private static final ZoneId ZONA_COLOMBIA = ZoneId.of("America/Bogota");

    /**
     * Retorna la fecha y hora actual exacta ajustada a la zona horaria de Colombia.
     */
    public static LocalDateTime ahoraColombia() {
        return ZonedDateTime.now(ZONA_COLOMBIA).toLocalDateTime();
    }
}