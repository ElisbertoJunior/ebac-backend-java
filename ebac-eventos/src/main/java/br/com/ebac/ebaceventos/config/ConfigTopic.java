package br.com.ebac.ebaceventos.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class ConfigTopic {

    @Value("${kafka.ebac.name.topic}")
    private String ebacNameTopic;

    public NewTopic EbacTopic() {
        return TopicBuilder.name(ebacNameTopic)
                .partitions(1)
                .replicas(1)
                .build();
    }
}
