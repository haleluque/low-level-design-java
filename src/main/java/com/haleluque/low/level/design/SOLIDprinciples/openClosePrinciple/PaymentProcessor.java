package com.haleluque.low.level.design.SOLIDprinciples.openClosePrinciple;

public class PaymentProcessor {
    public void pay(PaymentMethod paymentMethod, double amount) {
        //Runtime polymorphism
        paymentMethod.pay(amount);
    }
}
