package com.haleluque.low.level.design.design.patterns.StructuralPatterns.AdapterPattern.example;

public class SendGridService {
    public void sendEmail(String recipient, String title, String content){
        System.out.println("Sending email via SendGrid to " + recipient);
        System.out.println("Title: " + title);
        System.out.println("Content: " + content);
    }
}