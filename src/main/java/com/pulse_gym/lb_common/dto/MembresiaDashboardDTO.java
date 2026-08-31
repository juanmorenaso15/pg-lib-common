package com.pulse_gym.lb_common.dto;

import org.springframework.data.domain.Page;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MembresiaDashboardDTO {

    /** Membresías activas paginadas (tamaño 6 por defecto) */
    private Page<MembresiaConSociosDTO> membresiasPaginadas;

    /** Membresías por vencer paginadas (tamaño 6 por defecto) */
    private Page<MembresiaPorVencerDTO> membresiasPorVencer;

    /** Lista de usuarios activos para el modal de asignación */
    private List<UsuarioPerfilResponseDTO> usuariosActivos;
}