package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.StrategyPattern.example;

/**
 * The Strategy Pattern defines a family of algorithms, encapsulate each one of them (In strategy classes), and make them interchangeable.
 * The pattern allows algorithms to vary independently of the clients that use them.
 * This is particularly useful for situations where you need to select an algorithm at runtime.
 * <p>
 * This promotes flexibility and re-usability in your code. Basically the open close principle with runtime polymorphism
 * <p>
 * The Strategy pattern is often used when different algorithms (e.g., sorting algorithms like quicksort or merge sort)
 * need to be chosen at runtime based on the current state or data.
 */
public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.setPaymentStrategy(new CreditCard());
        paymentService.pay();
        paymentService.setPaymentStrategy(new DebitCard());
        paymentService.pay();
    }
}
