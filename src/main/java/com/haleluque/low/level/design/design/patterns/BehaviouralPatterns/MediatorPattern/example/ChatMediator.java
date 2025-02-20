package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.MediatorPattern.example;

/**
 * Mediator interface
 */
public interface ChatMediator {
    void sendMessage(String msg, ChatUser user);

    void addUser(ChatUser user);
}
