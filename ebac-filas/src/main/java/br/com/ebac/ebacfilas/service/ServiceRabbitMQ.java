package br.com.ebac.ebacfilas.service;

import br.com.ebac.ebacfilas.config.ConfigurationRabbitMQ;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceRabbitMQ {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendMessage(String message) {
        rabbitTemplate.convertAndSend(ConfigurationRabbitMQ.NOME_EXCHANGE, "ebac.rota.message", message);
    }
}
