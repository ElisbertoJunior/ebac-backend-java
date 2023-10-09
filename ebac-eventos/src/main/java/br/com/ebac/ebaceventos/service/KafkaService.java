package br.com.ebac.ebaceventos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

@Component
public class KafkaService {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Value("${kafka.ebac.name.topic}")
    private String nameTopic;
    public void sendMessage(String messsage) {
        kafkaTemplate.send(nameTopic, messsage);
    }
}
