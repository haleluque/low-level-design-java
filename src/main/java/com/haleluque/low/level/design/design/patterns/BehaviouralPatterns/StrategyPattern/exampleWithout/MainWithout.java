package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.StrategyPattern.exampleWithout;

public class MainWithout {
    public static void main(String[] args) {
        PaymentServiceWithout paymentServiceWithout = new PaymentServiceWithout();
        paymentServiceWithout.processPayment("DebitCard");
    }
}
