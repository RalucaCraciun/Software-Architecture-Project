package com.example.processor.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "your-topic", groupId = "group-id")
    public void listen(String message) {
        System.out.println("Received message: " + message);
        // Handle the message processing logic here
    }
}