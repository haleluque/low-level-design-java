package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.MediatorPattern.example;

/**
 * The Mediator Pattern facilitates communication between different objects (colleagues) in a system by
 * using a central mediator object. This pattern helps to reduce the complexity of communication between objects
 * and promotes loose coupling by keeping objects from referring to each other explicitly.
 * <p>
 * Examples:
 * - Air traffic control
 */
public class Main {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();
        ChatUser rahul = new ChatUser("Rahul", chatRoom);
        ChatUser amit = new ChatUser("Amit", chatRoom);
        ChatUser neha = new ChatUser("Neha", chatRoom);

        chatRoom.addUser(rahul);
        chatRoom.addUser(neha);
        chatRoom.addUser(amit);

        amit.sendMessage("Hi everyone");
    }
}
