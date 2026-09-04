package com.pulse_gym.lb_common.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.pulse_gym.lb_common.dto.ConsultaEquipoRequestDTO;
import com.pulse_gym.lb_common.dto.EquipoResponseDTO;
import com.pulse_gym.lb_common.dto.EquipoResponseWrapperDTO;

@FeignClient(name = "pg-ms-operation", url = "${microservicio.operacion.url:http://pg-ms-operation:8082}")
public interface EquipoClient {

    /**
     * Consulta equipos según los criterios de búsqueda (con wrapper)
     * 
     * @param request DTO con los filtros de búsqueda
     * @return Wrapper con la lista de equipos que coinciden con los criterios
     */
    @PostMapping("/api/equipos/consultar")
    EquipoResponseWrapperDTO consultarEquipos(@RequestBody ConsultaEquipoRequestDTO request);

    /**
     * Obtiene el conteo de equipos por estado
     * 
     * @param estado Estado del equipo (OPERATIVO, MANTENIMIENTO, FUERA_DE_SERVICIO, RETIRADO)
     * @return Cantidad de equipos en el estado indicado
     */
    @GetMapping("/api/equipos/conteo")
    Integer obtenerConteoPorEstado(@RequestParam("estado") String estado);

    /**
     * Obtiene todos los equipos disponibles en el gimnasio
     * 
     * @return Lista de equipos
     */
    @GetMapping("/api/equipos/todos")
    List<EquipoResponseDTO> obtenerTodosLosEquipos();

    /**
     * Obtiene equipos por sede
     * 
     * @param idSede ID de la sede
     * @return Lista de equipos de la sede
     */
    @GetMapping("/api/equipos/por-sede")
    List<EquipoResponseDTO> obtenerEquiposPorSede(@RequestParam("idSede") Integer idSede);

    /**
     * Obtiene equipos por estado
     * 
     * @param estado Estado del equipo (OPERATIVO, MANTENIMIENTO, FUERA_DE_SERVICIO, RETIRADO)
     * @return Lista de equipos con ese estado
     */
    @GetMapping("/api/equipos/por-estado")
    List<EquipoResponseDTO> obtenerEquiposPorEstado(@RequestParam("estado") String estado);
}