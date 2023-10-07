package br.com.ebac.ebacfilas.consumer;

import br.com.ebac.ebacfilas.config.ConfigurationRabbitMQ;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = ConfigurationRabbitMQ.NOME_FILA)
public class Consumer {
    @RabbitHandler
    public void consumerMessage(String message) {
        System.out.println("Recebendo msg " + message);
        System.out.println("======== Recebendo msg " + message);
    }
}
