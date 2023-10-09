package br.com.ebac.ebaceventos.producer;

import br.com.ebac.ebaceventos.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/events")
public class ProducerController {
    @Autowired
    private KafkaService service;

    @PostMapping
    public void sendMessage(@RequestBody String message) {
        System.out.println("Mensagem enviada! " + message );
        service.sendMessage(message);
    }
}
