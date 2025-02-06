package com.project.newsletter.configuration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaTopicConfiguration {

    @Value("${topic.name}")
    private String TOPIC_NAME;

    @Bean
    public NewTopic createTopic() {
        return new NewTopic(TOPIC_NAME, 3, (short) 1);
    }
}
