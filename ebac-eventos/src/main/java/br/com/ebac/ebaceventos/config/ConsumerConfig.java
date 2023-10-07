package br.com.ebac.ebaceventos.config;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerConfig {
    @KafkaListener(topics = "${kafka.ebac.name.topic}", groupId = "ebacGroup")
    public void consumeMessage(String message) {
        System.out.println("=============== Recebendo mensagem ==============");
        System.out.println("========== " + message);
        System.out.println("=============== FIM Recebendo mensagem ==============");

    }
}
