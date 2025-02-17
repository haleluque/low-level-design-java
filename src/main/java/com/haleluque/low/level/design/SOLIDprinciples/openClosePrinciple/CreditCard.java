package com.haleluque.low.level.design.SOLIDprinciples.openClosePrinciple;

public class CreditCard implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid with credit card: " + amount);
    }
}
