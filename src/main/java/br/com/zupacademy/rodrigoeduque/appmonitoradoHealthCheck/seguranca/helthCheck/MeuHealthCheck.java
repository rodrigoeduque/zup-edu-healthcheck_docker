package br.com.zupacademy.rodrigoeduque.appmonitoradoHealthCheck.seguranca.helthCheck;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.actuate.health.Status;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class MeuHealthCheck implements HealthIndicator {

    @Override
    public Health health() {
        Map<String,Object> detalhes = new HashMap<>();
        detalhes.put("versão", "1.0");
        detalhes.put("descrição","Health Check Rodrigo" );
        detalhes.put("ip", "192.168.0.1");

        return Health.status(Status.UP).withDetails(detalhes).build();
    }
}
