package com.haleluque.low.level.design.SOLIDprinciples.singleResponsability;

public class EmailService {
    public void sendEmailNotification(String amount) {
        System.out.println("Email sent with invoice info with amount " + amount);
    }
}
