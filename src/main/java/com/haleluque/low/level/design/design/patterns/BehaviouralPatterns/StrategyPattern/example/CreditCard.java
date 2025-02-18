package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.StrategyPattern.example;

public class CreditCard implements PaymentStrategy{
    @Override
    public void processPayment() {
        System.out.println("Making payment via credit card");
    }
}
