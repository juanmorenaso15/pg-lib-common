package com.pulse_gym.lb_common.client;

import com.pulse_gym.lb_common.dto.EventoPagoRequestDTO;
import com.pulse_gym.lb_common.dto.MessegeGlobalDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "pg-ms-reports",contextId = "eventoPagoClient" ,url = "${microservicio.reports.url:http://pg-ms-reports:8084}")
public interface EventoPagoClient {

    /**
     * Envía un evento de pago al microservicio de reportes
     * @param request
     * @return
     */
    @PostMapping("/api/eventos/pago")
    MessegeGlobalDTO enviarEventoPago(@RequestBody EventoPagoRequestDTO request);
}