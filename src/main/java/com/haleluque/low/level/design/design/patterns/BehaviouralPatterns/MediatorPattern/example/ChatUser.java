package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.MediatorPattern.example;

/**
 * Colleague class
 */
public class ChatUser {
    private final String name;
    private final ChatMediator chatMediator;

    public ChatUser(String name, ChatMediator chatMediator) {
        this.name = name;
        this.chatMediator = chatMediator;
    }

    public void sendMessage(String msg) {
        System.out.println(this.name + " Sending a msg " + msg);
        chatMediator.sendMessage(msg, this); //the user only interact with others through the mediator
    }

    public String getName() {
        return name;
    }

    public void receiveMessage(String msg, ChatUser sender) {
        System.out.println(this.name + " received message: '" + msg + "' from " + sender.getName());
    }
}
