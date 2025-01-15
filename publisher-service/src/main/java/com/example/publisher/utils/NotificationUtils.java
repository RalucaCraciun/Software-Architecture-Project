package com.example.publisher.utils;

import org.springframework.stereotype.Component;

@Component
public class NotificationUtils {

    public void logNotification(String notification) {
        System.out.println("Logging notification: " + notification);
    }
}