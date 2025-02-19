package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.IteratorPattern.exercise;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class PushNotification implements NotificationCollection {

    private final Set<Notification> pushNotifications;

    public PushNotification() {
        pushNotifications = new LinkedHashSet<>();
    }

    public void addNotification(String message) {
        pushNotifications.add(new Notification(message));
    }

    @Override
    public Iterator<Notification> createIterator() {
        return new PushNotificationIterator(this.pushNotifications);
    }

    private static class PushNotificationIterator implements Iterator<Notification> {
        private final Iterator<Notification> iterator;

        public PushNotificationIterator(Set<Notification> notifications) {
            this.iterator = notifications.iterator();
        }

        @Override
        public boolean hasNext() {
            return iterator.hasNext();
        }

        @Override
        public Notification next() {
            return iterator.next();
        }
    }
}