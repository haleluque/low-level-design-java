package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.StrategyPattern.exampleWithout;

public class PaymentServiceWithout {
    public void processPayment(String paymentMethod){
        if (paymentMethod.equals("CreditCard")) {
            System.out.println("Making payment via credit card");
        } else if (paymentMethod.equals("DebitCard")) {
            System.out.println("Making payment via debit card");
        } else {
            System.out.println("Unsupported payment method");
        }
    }
}
