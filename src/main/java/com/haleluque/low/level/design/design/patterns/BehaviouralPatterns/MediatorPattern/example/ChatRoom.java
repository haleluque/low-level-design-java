package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.MediatorPattern.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete mediator with implementations
 */
public class ChatRoom implements ChatMediator {
    private final List<ChatUser> users;

    public ChatRoom() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String msg, ChatUser sender) {
        users.stream()
                .filter(user -> user != sender)
                .forEach(chatUser -> chatUser.receiveMessage(msg, sender));
    }

    @Override
    public void addUser(ChatUser user) {
        users.add(user);
    }
}
