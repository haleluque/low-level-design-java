package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.IteratorPattern.exercise;

import java.util.Iterator;
import java.util.ArrayDeque;
import java.util.Queue;

public class SMSNotification implements NotificationCollection {

    private final Queue<Notification> smsNotifications;

    public SMSNotification() {
        smsNotifications = new ArrayDeque<>();
    }

    public void addNotification(String message) {
        smsNotifications.add(new Notification(message));
    }

    @Override
    public Iterator<Notification> createIterator() {
        return new SMSNotificationIterator(smsNotifications);
    }

    private record SMSNotificationIterator(Queue<Notification> notifications) implements Iterator<Notification> {
        private SMSNotificationIterator(Queue<Notification> notifications) {
            this.notifications = new ArrayDeque<>(notifications);
        }

        @Override
        public boolean hasNext() {
            return !notifications.isEmpty();
        }

        @Override
        public Notification next() {
            return notifications.poll();
        }
    }
}
