package com.haleluque.low.level.design.SOLIDprinciples.openClosePrinciple;

public class Paypal implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Paid with paypal: " + amount);
    }
}
