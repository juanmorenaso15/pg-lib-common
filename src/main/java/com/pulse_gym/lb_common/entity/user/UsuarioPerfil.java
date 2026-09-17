package com.pulse_gym.lb_common.entity.user;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import com.pulse_gym.lb_common.enums.EnumEstadoUsuario;
import com.pulse_gym.lb_common.enums.EnumNivelExperiencia;
import com.pulse_gym.lb_common.enums.EnumSexo;
import com.pulse_gym.lb_common.enums.EnumTurno;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data
@Table(name = "usuario_perfil")
public class UsuarioPerfil {

    /** Identificador único del usuario */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long idUsuario;

    /** Nombre del usuario */
    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    /** Email del usuario */
    @Column(name = "email", nullable = false, length = 150)
    private String email;

    /** Apellido del usuario */
    @Column(name = "apellido", nullable = false, length = 100)
    private String apellido;

    /** Estado del usuario (ACTIVO, INACTIVO, etc.) */
    @Enumerated(EnumType.STRING)
    @Column(name = "estado", nullable = false, length = 20)
    private EnumEstadoUsuario estado = EnumEstadoUsuario.ACTIVO;

    /** Sexo del usuario (MASCULINO, FEMENINO) */
    @Enumerated(EnumType.STRING)
    @Column(name = "sexo", length = 255)
    private EnumSexo sexo;

    /** Teléfono de contacto */
    @Column(name = "telefono", length = 20)
    private String telefono;

    /** Documento de identidad único */
    @Column(name = "documento_identidad", nullable = false, unique = true, length = 20)
    private String documentoIdentidad;

    /** URL de la foto de perfil */
    @Column(name = "foto_url", nullable = false, length = 255)
    private String fotoUrl;

    /** Fecha de contratación (para personal) */
    @Column(name = "fecha_contratacion")
    private LocalDate fechaContratacion;

    /** Especialidad del entrenador */
    @Column(name = "especialidad", length = 100)
    private String especialidad;

    /** Años de experiencia (para entrenador) */
    @Column(name = "anos_experiencia")
    private Short anosExperiencia;

    /** Horario de disponibilidad (para entrenador) */
    @Column(name = "horario_disponibilidad", length = 255)
    private String horarioDisponibilidad;

    /** Tarifa por hora (para entrenador) */
    @Column(name = "tarifa_hora", precision = 10, scale = 2)
    private BigDecimal tarifaHora;

    /** Turno de trabajo (para recepcionista) */
    @Enumerated(EnumType.STRING)
    @Column(name = "turno", length = 20)
    private EnumTurno turno;

    /** Fecha de nacimiento del usuario */
    @Column(name = "fecha_nacimiento", nullable = false)
    private LocalDate fechaNacimiento;

    /** Nombre del contacto de emergencia */
    @Column(name = "contacto_emergencia_nombre", length = 100)
    private String contactoEmergenciaNombre;

    /** Teléfono del contacto de emergencia */
    @Column(name = "contacto_emergencia_telefono", length = 20)
    private String contactoEmergenciaTelefono;

    /** Objetivo principal del socio */
    @Column(name = "objetivo_principal", length = 255)
    private String objetivoPrincipal;

    /** Nivel de experiencia del socio */
    @Enumerated(EnumType.STRING)
    @Column(name = "nivel_experiencia", length = 20)
    private EnumNivelExperiencia nivelExperiencia;

    /** Fecha de registro del usuario */
    @Column(name = "fecha_registro", nullable = false, updatable = false)
    private LocalDateTime fechaRegistro;

    /** ID de la sede asignada */
    @Column(name = "id_sede")
    private Integer idSede;

    /** ID del dispositivo biométrico */
    @Column(name = "biometric_device_id", length = 100)
    private String biometricDeviceId;

    /** Establece la fecha de registro antes de persistir */
    @PrePersist
    protected void onCreate() {
        if (fechaRegistro == null) {
            fechaRegistro = com.pulse_gym.lb_common.util.FechaUtils.ahoraColombia();
        }
    }

    /** Lista de documentos legales del usuario */
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private List<DocumentoLegal> documentosLegales = new ArrayList<>();

    public void addDocumentoLegal(DocumentoLegal documento) {
        documentosLegales.add(documento);
        documento.setUsuario(this);
    }

    public void removeDocumentoLegal(DocumentoLegal documento) {
        documentosLegales.remove(documento);
        documento.setUsuario(null);
    }

    /** Lista de certificaciones del entrenador */
    @OneToMany(mappedBy = "entrenador", cascade = CascadeType.ALL, orphanRemoval = true)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private List<Certificacion> certificaciones = new ArrayList<>();

    public void addCertificacion(Certificacion certificacion) {
        certificaciones.add(certificacion);
        certificacion.setEntrenador(this);
    }

    public void removeCertificacion(Certificacion certificacion) {
        certificaciones.remove(certificacion);
        certificacion.setEntrenador(null);
    }

    /** Perfil médico del socio */
    @OneToOne(mappedBy = "socio", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private PerfilMedico perfilMedico;

    /** Historial físico del socio */
    @OneToMany(mappedBy = "socio", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private List<HistorialFisico> historialFisico = new ArrayList<>();

    /** Mediciones registradas por el recepcionista */
    @OneToMany(mappedBy = "recepcionista", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private List<HistorialFisico> medicionesRegistradas = new ArrayList<>();

    public void addHistorialFisico(HistorialFisico historial) {
        historialFisico.add(historial);
        historial.setSocio(this);
    }

    public void removeHistorialFisico(HistorialFisico historial) {
        historialFisico.remove(historial);
        historial.setSocio(null);
    }

    /** Membresías asignadas al socio */
    @OneToMany(mappedBy = "socio", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private List<SocioMembresia> membresiaAsignadas = new ArrayList<>();

    public SocioMembresia getMembresiaActiva() {
        if (membresiaAsignadas == null)
            return null;
        return membresiaAsignadas.stream()
                .filter(SocioMembresia::isActiva)
                .findFirst()
                .orElse(null);
    }

    public void addMembresiaAsignadav(SocioMembresia socioMembresia) {
        membresiaAsignadas.add(socioMembresia);
        socioMembresia.setSocio(this);
    }

    public void removeMembresiaAsignada(SocioMembresia socioMembresia) {
        membresiaAsignadas.remove(socioMembresia);
        socioMembresia.setSocio(null);
    }
}