package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.StrategyPattern.example;

public class PaymentService {
    private PaymentStrategy paymentStrategy;
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(){
        paymentStrategy.processPayment();
    }
}
