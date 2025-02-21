package com.haleluque.low.level.design.design.patterns.StructuralPatterns.AdapterPattern.example;

/**
 * Adapter class
 */
public class SendGridAdapter implements NotificationService {
    private final SendGridService sendGridService;

    public SendGridAdapter(SendGridService sendGridService) {
        this.sendGridService = sendGridService;
    }

    @Override
    public void send(String to, String subject, String body) {
        //Adapter method to convert parameters to sendgrid form
        sendGridService.sendEmail(to, subject, body);
    }
}
