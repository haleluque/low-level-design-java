package com.haleluque.low.level.design.SOLIDprinciples.dependencyInversion;

public class SmsService implements NotificationChannel {
    @Override
    public void send(String message) {
        System.out.println("Sending sms: " + message);
    }
}
