package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.StrategyPattern.example;

public class DebitCard implements PaymentStrategy{
    @Override
    public void processPayment() {
        System.out.println("Making payment via debit card");
    }
}
