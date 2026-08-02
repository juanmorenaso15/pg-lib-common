package com.pulse_gym.lb_common.client;

import com.pulse_gym.lb_common.dto.EventoMaquinaRequestDTO;
import com.pulse_gym.lb_common.dto.MessegeGlobalDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "pg-ms-reports", url = "${microservicio.reports.url:http://pg-ms-reports:8084}", contextId = "eventoMaquinaClient")
public interface EventoMaquinaClient {

    @PostMapping("/api/eventos/maquina")
    MessegeGlobalDTO enviarEventoMaquina(@RequestBody EventoMaquinaRequestDTO request);
}