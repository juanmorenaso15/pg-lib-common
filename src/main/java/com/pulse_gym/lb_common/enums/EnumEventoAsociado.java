package com.pulse_gym.lb_common.enums;

public enum EnumEventoAsociado {

    /**
     * Evento de notificacion para bienvenida
     */
    WELCOME,

    /**
     * Evento de verificacion al registrar nuevo usuario en auth
     */
    REGISTRO_USUARIO,
    
    /**
     * Evento de inicio de sesion de usuario
     */
    LOGIN_USUARIO,

    /**
     * Evento notificacion de recordatirio de pago
     */
    PAYMENT_REMINDER,

    /**
     * Evento de notificacion al conseguir un logro
     */
    ACHIEVEMENT,

    /**
     * Evento de notificacion para alerta de mantenimiento (el equipo entro en mantenimiento)
     */
    MAINTENANCE_ALERT,

    /**
     * Evento de notificacion cuando se reporta una falla/daño en un equipo
     */
    EQUIPO_DANADO,

    /**
     * Evento de notificacion promocional
     */
    PROMOTION,

    /** 
     * Evento de cambiar la contraseña
     */
    CHANGE_PASSWORD
}
