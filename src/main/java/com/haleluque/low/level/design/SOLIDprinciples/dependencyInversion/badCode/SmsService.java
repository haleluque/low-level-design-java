package com.haleluque.low.level.design.SOLIDprinciples.dependencyInversion.badCode;

public class SmsService {
    public void sendSMS(String message) {
        System.out.println("Sending sms: " + message);
    }
}
