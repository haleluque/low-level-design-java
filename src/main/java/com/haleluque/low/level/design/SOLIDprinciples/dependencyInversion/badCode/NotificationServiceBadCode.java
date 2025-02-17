package com.haleluque.low.level.design.SOLIDprinciples.dependencyInversion.badCode;

/**
 * High-level modules should not depend on low-level modules;
 * Both should depend on Abstractions
 * <p>
 * Use dependency injection to connect between modules/tiers
 */
public class NotificationServiceBadCode {
    private final EmailService emailService;

    private final SmsService smsService;

    //Tightly coupled
    public NotificationServiceBadCode() {
        this.emailService = new EmailService();
        this.smsService = new SmsService();
    }

    public void notifyByEmail(String message) {
        emailService.sendEmail(message);
    }

    public void notifyBySmS(String message) {
        smsService.sendSMS(message);
    }
}
