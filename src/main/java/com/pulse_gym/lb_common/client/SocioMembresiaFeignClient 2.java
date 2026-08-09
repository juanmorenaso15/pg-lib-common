package com.pulse_gym.lb_common.client;

import com.pulse_gym.lb_common.dto.SocioMoraDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;

@FeignClient(name = "pg-ms-users", path = "/api/internal/socios-membresias",  contextId = "manejoSociosMora")
public interface SocioMembresiaFeignClient {

    @GetMapping("/mora")
    List<SocioMoraDTO> obtenerSociosEnMora(
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fechaInicio,
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fechaFin);
}