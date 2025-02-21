package com.haleluque.low.level.design.design.patterns.StructuralPatterns.AdapterPattern.example;

//Legacy Code: Email Notification Service
public class EmailNotificationService implements NotificationService{
    public void send(String to, String subject, String body) {
        System.out.println("Sending Email to " + to);
        System.out.println("Subject: " + subject);
        System.out.println("Body: " + body);
    }
}
