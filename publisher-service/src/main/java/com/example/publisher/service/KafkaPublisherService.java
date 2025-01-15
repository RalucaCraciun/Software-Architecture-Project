package com.example.publisher.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaPublisherService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private String topic = "your-topic";  // The topic name you want to send messages to

    public void publishMessage(String message) {
        kafkaTemplate.send(topic, message);
    }
}

