package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.MediatorPattern.exampleWithout;

public class MainWithout {
    public static void main(String[] args) {
        UserWithout rahul = new UserWithout("Rahul");
        UserWithout amit = new UserWithout("Amit");
        UserWithout neha = new UserWithout("Neha");

        rahul.sendMessage("Hello",amit);
        rahul.sendMessage("Hello",neha);
    }
}
