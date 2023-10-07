package br.com.ebac.ebacfilas.producer;

import br.com.ebac.ebacfilas.service.ServiceRabbitMQ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messages")
public class Producer {

    @Autowired
    private ServiceRabbitMQ serviceRabbitMQ;

    @PostMapping
    public void sendMessage(@RequestBody String message) {
        System.out.println("Enviando mensagem: " + message);

        serviceRabbitMQ.sendMessage(message);
    }
}
