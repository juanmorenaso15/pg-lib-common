package com.pulse_gym.lb_common.entity.user;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
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

    /** Estado del usuario (ACTIVO, INACTIVO, SUSPENDIDO) */
    @Enumerated(EnumType.STRING)
    @Column(name = "estado", nullable = false)
    private EnumEstadoUsuario estado = EnumEstadoUsuario.ACTIVO;

    /** Sexo del usuario (MASCULINO, FEMENINO, OTRO) */
    @Enumerated(EnumType.STRING)
    @Column(name = "sexo")
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
    @Column(name = "fecha_contratacion", nullable = false)
    private LocalDate fechaContratacion;

    /** Especialidad del entrenador */
    @Column(name = "especialidad", nullable = false, length = 100)
    private String especialidad;

    /** Años de experiencia (para entrenador) */
    @Column(name = "anos_experiencia", nullable = false)
    private Short anosExperiencia;

    /** Horario de disponibilidad (para entrenador) */
    @Column(name = "horario_disponibilidad", nullable = false, length = 255)
    private String horarioDisponibilidad;

    /** Tarifa por hora (para entrenador) */
    @Column(name = "tarifa_hora", nullable = false, precision = 10, scale = 2)
    private BigDecimal tarifaHora;

    /** Turno de trabajo (para recepcionista) */
    @Enumerated(EnumType.STRING)
    @Column(name = "turno", nullable = false)
    private EnumTurno turno;

    /** Fecha de nacimiento del usuario */
    @Column(name = "fecha_nacimiento", nullable = false)
    private LocalDate fechaNacimiento;

    /** Nombre del contacto de emergencia */
    @Column(name = "contacto_emergencia_nombre", nullable = false, length = 100)
    private String contactoEmergenciaNombre;

    /** Teléfono del contacto de emergencia */
    @Column(name = "contacto_emergencia_telefono", nullable = false, length = 20)
    private String contactoEmergenciaTelefono;

    /** Objetivo principal del socio */
    @Column(name = "objetivo_principal", nullable = false, length = 255)
    private String objetivoPrincipal;

    /** Nivel de experiencia del socio */
    @Enumerated(EnumType.STRING)
    @Column(name = "nivel_experiencia", nullable = false)
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
        fechaRegistro = LocalDateTime.now();
    }

    /** Lista de documentos legales del usuario */
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private List<DocumentoLegal> documentosLegales = new ArrayList<>();

    /**
     * Agrega un documento legal al usuario
     * 
     * @param documento Documento a agregar
     */
    public void addDocumentoLegal(DocumentoLegal documento) {
        documentosLegales.add(documento);
        documento.setUsuario(this);
    }

    /**
     * Elimina un documento legal del usuario
     * 
     * @param documento Documento a eliminar
     */
    public void removeDocumentoLegal(DocumentoLegal documento) {
        documentosLegales.remove(documento);
        documento.setUsuario(null);
    }

    /** Lista de certificaciones del entrenador */
    @OneToMany(mappedBy = "entrenador", cascade = CascadeType.ALL, orphanRemoval = true)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private List<Certificacion> certificaciones = new ArrayList<>();

    /**
     * Agrega una certificación al entrenador
     * 
     * @param certificacion Certificación a agregar
     */
    public void addCertificacion(Certificacion certificacion) {
        certificaciones.add(certificacion);
        certificacion.setEntrenador(this);
    }

    /**
     * Elimina una certificación del entrenador
     * 
     * @param certificacion Certificación a eliminar
     */
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

    /**
     * Agrega un registro al historial físico del socio
     * 
     * @param historial Registro a agregar
     */
    public void addHistorialFisico(HistorialFisico historial) {
        historialFisico.add(historial);
        historial.setSocio(this);
    }

    /**
     * Elimina un registro del historial físico del socio
     * 
     * @param historial Registro a eliminar
     */
    public void removeHistorialFisico(HistorialFisico historial) {
        historialFisico.remove(historial);
        historial.setSocio(null);
    }

    /** Membresías asignadas al socio */
    @OneToMany(mappedBy = "socio", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private List<SocioMembresia> membresiaAsignadas = new ArrayList<>();

    /**
     * Obtiene la membresía activa del socio
     * 
     * @return Membresía activa o null si no tiene
     */
    public SocioMembresia getMembresiaActiva() {
        if (membresiaAsignadas == null)
            return null;
        return membresiaAsignadas.stream()
                .filter(SocioMembresia::isActiva)
                .findFirst()
                .orElse(null);
    }

    /**
     * Agrega una membresía al socio
     * 
     * @param socioMembresia Membresía a agregar
     */
    public void addMembresiaAsignadav(SocioMembresia socioMembresia) {
        membresiaAsignadas.add(socioMembresia);
        socioMembresia.setSocio(this);
    }

    /**
     * Elimina una membresía del socio
     * 
     * @param socioMembresia Membresía a eliminar
     */
    public void removeMembresiaAsignada(SocioMembresia socioMembresia) {
        membresiaAsignadas.remove(socioMembresia);
        socioMembresia.setSocio(null);
    }
}