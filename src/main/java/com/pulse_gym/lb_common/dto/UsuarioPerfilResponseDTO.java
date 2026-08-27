package com.pulse_gym.lb_common.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import com.pulse_gym.lb_common.enums.EnumEstadoUsuario;
import com.pulse_gym.lb_common.enums.EnumNivelExperiencia;
import com.pulse_gym.lb_common.enums.EnumRol;
import com.pulse_gym.lb_common.enums.EnumSexo;
import com.pulse_gym.lb_common.enums.EnumTurno;

import lombok.Data;

@Data
public class UsuarioPerfilResponseDTO {

    /** ID del usuario */
    private Long idUsuario;

    /** Nombre de usuario (username) - desde Auth */
    private String username;

    /** Rol del usuario (ADMIN, ENTRENADOR, RECEPCIONISTA, SOCIO) */
    private EnumRol rol;

    /** Estado del usuario (ACTIVO, INACTIVO, SUSPENDIDO) */
    private EnumEstadoUsuario estado;

    /** Sexo del usuario */
    private EnumSexo sexo;

    /** Email del usuario */
    private String email;

    /** Nombre del usuario */
    private String nombre;

    /** Apellido del usuario */
    private String apellido;

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

    /** Fecha de registro del usuario */
    private LocalDateTime fechaRegistro;

    /** ID de la sede asignada */
    private Integer idSede;

    /** ID del dispositivo biométrico */
    private String biometricDeviceId;
}