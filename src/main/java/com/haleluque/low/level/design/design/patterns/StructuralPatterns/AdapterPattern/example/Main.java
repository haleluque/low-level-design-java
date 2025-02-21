package com.haleluque.low.level.design.design.patterns.StructuralPatterns.AdapterPattern.example;

/**
 * The adapter pattern is a structural design pattern that allows objects with incompatible interfaces to
 * work together
 * <p>
 * Use cases:
 * - convert legacy code into newer formats
 * - When integrating external APIs, you need adapters to convert data formats or APIs to match you system's requirements
 */
public class Main {
    public static void main(String[] args) {
        NotificationService emailService = new EmailNotificationService();
        emailService.send("customer@codingminutes.com","order confirmation","your order has been received!");

        NotificationService emailServiceUsingSendGrid = new SendGridAdapter(new SendGridService());
        emailServiceUsingSendGrid.send("customer@codingminutes.com","order confirmation","your order has been received!");
    }
}
