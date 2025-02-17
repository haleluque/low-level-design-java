package com.haleluque.low.level.design.SOLIDprinciples.dependencyInversion.badCode;

public class EmailService {
    public void sendEmail(String message) {
        System.out.println("Sending email: " + message);
    }
}
