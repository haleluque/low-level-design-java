package com.haleluque.low.level.design.SOLIDprinciples.dependencyInversion;

public class Main {
    public static void main(String[] args) {

        //Code is more flexible and easier to test
        //Correctly injecting dependencies
        EmailService emailService = new EmailService();
        NotificationService notificationService = new NotificationService(emailService);
        notificationService.notify("email has been set");

        SmsService smsService = new SmsService();
        NotificationService notificationServiceSMS = new NotificationService(smsService);
        notificationServiceSMS.notify("SMS has been set");
    }
}
