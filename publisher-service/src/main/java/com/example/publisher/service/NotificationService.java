package com.example.publisher.service;

import com.example.publisher.utils.NotificationUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    private NotificationUtils notificationUtils;

    private static final String TOPIC = "notification-topic";

    public String sendNotification(String notification) {
        notificationUtils.logNotification(notification);
        kafkaTemplate.send(TOPIC, "Sending notification: " + notification);
        return "Notification sent successfully!";
    }
}
