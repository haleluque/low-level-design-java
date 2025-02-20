package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.MediatorPattern.exampleWithout;

public record UserWithout(String name) {
    public void sendMessage(String msg, UserWithout recipient) {
        System.out.println(this.name + " sending " + msg + " to " + recipient.name());
    }
}
