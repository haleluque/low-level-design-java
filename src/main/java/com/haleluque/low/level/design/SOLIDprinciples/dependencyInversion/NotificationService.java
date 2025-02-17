package com.haleluque.low.level.design.SOLIDprinciples.dependencyInversion;

public class NotificationService {
    private final NotificationChannel notificationChannel;

    public NotificationService(NotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
    }

    public void notify(String message){
        notificationChannel.send(message);
    }
}
