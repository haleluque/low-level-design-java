package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.IteratorPattern.exercise;

import java.util.Iterator;

public interface NotificationCollection {
    Iterator<Notification> createIterator();
}
