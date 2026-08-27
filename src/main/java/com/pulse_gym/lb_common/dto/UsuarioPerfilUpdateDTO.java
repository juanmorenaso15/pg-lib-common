package com.pulse_gym.lb_common.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.pulse_gym.lb_common.enums.EnumNivelExperiencia;
import com.pulse_gym.lb_common.enums.EnumSexo;
import com.pulse_gym.lb_common.enums.EnumTurno;

import lombok.Data;

@Data
public class UsuarioPerfilUpdateDTO {

    /** Nombre del usuario */
    private String nombre;

    /** Apellido del usuario */
    private String apellido;

    /** Email del usuario */
    private String email;

    /** Sexo del usuario */
    private EnumSexo sexo;

    /** Teléfono de contacto */
    private String telefono;

    /** Documento de identidad */
    private String documentoIdentidad;

    /** URL de la foto de perfil */
    private String fotoUrl;

    /** Fecha de contratación (para personal) */
    private LocalDate fechaContratacion;

    /** Especialidad del entrenador */
    private String especialidad;

    /** Años de experiencia (para entrenador) */
    private Short anosExperiencia;

    /** Horario de disponibilidad (para entrenador) */
    private String horarioDisponibilidad;

    /** Tarifa por hora (para entrenador) */
    private BigDecimal tarifaHora;

    /** Turno de trabajo (para recepcionista) */
    private EnumTurno turno;

    /** Fecha de nacimiento del usuario */
    private LocalDate fechaNacimiento;

    /** Nombre del contacto de emergencia */
    private String contactoEmergenciaNombre;

    /** Teléfono del contacto de emergencia */
    private String contactoEmergenciaTelefono;

    /** Objetivo principal (para socio) */
    private String objetivoPrincipal;

    /** Nivel de experiencia (para socio) */
    private EnumNivelExperiencia nivelExperiencia;

    /** ID de la sede asignada */
    private Integer idSede;
}