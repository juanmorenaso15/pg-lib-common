package com.pulse_gym.lb_common.entity.reports;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import com.pulse_gym.lb_common.enums.EnumTipoAcceso;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "evento_acceso")
public class EventoAcceso {

    /**
     * Identificador unico del evento
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_evento_acceso")
    private Long idEventoAcesso;
    
    /**
     * Identificador del socio
     */
    @Column(name = "socio_identificacion")
    private Long socioIdentificacion;

    /**
     * Tipo de acceso a la asistencia, web, biometrico, etc.
     */
    @Column(name = "tipo_evento")
    private EnumTipoAcceso tipoAcceso;

    /**
     * fecha del registro en el sistema
     */
    @Column(name = "fecha_registro")
    private LocalDateTime fechaRegistro;

}
