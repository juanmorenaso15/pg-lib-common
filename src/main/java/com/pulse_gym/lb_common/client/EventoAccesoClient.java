package com.pulse_gym.lb_common.client;

import com.pulse_gym.lb_common.dto.EventoAccesoRequestDTO;
import com.pulse_gym.lb_common.dto.MessegeGlobalDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "pg-ms-reports",contextId = "eventoAccesoClient" ,url = "${microservicio.reports.url:http://pg-ms-reports:8084}")
public interface EventoAccesoClient {

    @PostMapping("/api/eventos/acceso")
    MessegeGlobalDTO enviarEventoAcceso(@RequestBody EventoAccesoRequestDTO request);
}