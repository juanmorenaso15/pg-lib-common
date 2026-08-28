package com.pulse_gym.lb_common.client;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import com.pulse_gym.lb_common.dto.UsuarioPerfilResponseDTO;
import com.pulse_gym.lb_common.enums.EnumEstadoUsuario;

@FeignClient(name = "pg-ms-users", url = "${microservicio.usuarios.url:http://pg-ms-users:8081}", contextId = "clienteGeneral")
public interface UsuarioClient {

    @GetMapping("/api/v1/usuarios/{idUsuario}")
    UsuarioPerfilResponseDTO obtenerUsuarioPorId(@PathVariable("idUsuario") Long idUsuario);

    /**
     * Obtiene el perfil de usuario por email para integracion entre microservicios
     */
    @GetMapping("/api/internal/usuarios/email/{email}")
    UsuarioPerfilResponseDTO obtenerUsuarioPorEmail(@PathVariable("email") String email);

    /**
     * Endpoint interno entre microservicios por ID
     */
    @GetMapping("/api/internal/usuarios/{idUsuario}")
    UsuarioPerfilResponseDTO obtenerUsuarioPorIdInterno(@PathVariable("idUsuario") Long idUsuario);

    /**
     * Obtiene la lista completa de perfiles para cargar fotos masivamente
     */
    @GetMapping("/api/v1/usuarios")
    List<UsuarioPerfilResponseDTO> obtenerTodosLosUsuarios(@RequestHeader(value = "X-User-Rol", required = false) String userRol);

    /**
     * Cambia el estado de un usuario (activo/inactivo) y sincroniza con el perfil del usuario.
     */
    @PutMapping("/api/internal/usuarios/email/estado")
    void cambiarEstadoInternoPorEmail(
            @RequestParam("email") String email,
            @RequestParam("estado") EnumEstadoUsuario estado);
}