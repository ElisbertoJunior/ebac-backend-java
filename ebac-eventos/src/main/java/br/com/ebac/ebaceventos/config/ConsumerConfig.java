package br.com.ebac.ebaceventos.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.DltHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.RetryableTopic;
import org.springframework.stereotype.Component;

@Configuration
public class ConsumerConfig {

    @RetryableTopic(attempts = "2")
    @KafkaListener(topics = "${kafka.ebac.name.topic}", groupId = "ebacGroup")
    public void consumeMessage(String message) {
        if(message.contains("DLT")) {
            throw new IllegalArgumentException("Teste DLT");
        }

        System.out.println("=============== Recebendo mensagem ==============");
        System.out.println("========== " + message);
        System.out.println("=============== FIM Recebendo mensagem ==============");

    }

    @DltHandler
    public void consumeMessageDLT(String message) {
        System.out.println("=============== Recebendo mensagem da DLT ==============");
        System.out.println("========== " + message);
        System.out.println("=============== FIM Recebendo mensagem DLT ==============");
    }
}
