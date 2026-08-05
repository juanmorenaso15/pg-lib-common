package com.pulse_gym.lb_common.dto;

import java.time.LocalDate;

import com.pulse_gym.lb_common.enums.EnumNivelExperiencia;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CompletarPerfilSocioRequestDTO {

    /** Nombre del socio */
    @NotBlank(message = "El nombre no puede estar vacío.")
    @Size(max = 100, message = "El nombre no puede superar los 100 caracteres.")
    private String nombre;

    /** Apellido del socio */
    @NotBlank(message = "El apellido no puede estar vacío.")
    @Size(max = 100, message = "El apellido no puede superar los 100 caracteres.")
    private String apellido;

    /** Teléfono del socio */
    @Size(max = 20, message = "El teléfono no puede superar los 20 caracteres.")
    private String telefono;

    /** Documento de identidad del socio */
    @NotBlank(message = "El documento de identidad es obligatorio.")
    @Size(max = 20, message = "El documento no puede superar los 20 caracteres.")
    private String documentoIdentidad;

    /** URL de la foto del socio */
    @NotBlank(message = "La URL de la foto es obligatoria.")
    @Size(max = 255, message = "La URL de la foto no puede superar los 255 caracteres.")
    private String fotoUrl;

    /** Fecha de nacimiento del socio */
    @NotNull(message = "La fecha de nacimiento es obligatoria.")
    @Past(message = "La fecha de nacimiento debe ser una fecha pasada.")
    private LocalDate fechaNacimiento;

    /** Nombre del contacto de emergencia */
    @NotBlank(message = "El nombre del contacto de emergencia es obligatorio.")
    @Size(max = 100, message = "El nombre del contacto no puede superar los 100 caracteres.")
    private String contactoEmergenciaNombre;

    /** Teléfono del contacto de emergencia */
    @NotBlank(message = "El teléfono del contacto de emergencia es obligatorio.")
    @Size(max = 20, message = "El teléfono del contacto no puede superar los 20 caracteres.")
    private String contactoEmergenciaTelefono;

    /** Objetivo principal del socio */
    @NotBlank(message = "El objetivo principal es obligatorio.")
    @Size(max = 255, message = "El objetivo no puede superar los 255 caracteres.")
    private String objetivoPrincipal;

    /** Nivel de experiencia del socio */
    @NotNull(message = "El nivel de experiencia es obligatorio.")
    private EnumNivelExperiencia nivelExperiencia;

    /** ID de la sede a la que pertenece el socio */
    @NotNull(message = "El ID de la sede es obligatorio.")
    private Integer idSede;
}