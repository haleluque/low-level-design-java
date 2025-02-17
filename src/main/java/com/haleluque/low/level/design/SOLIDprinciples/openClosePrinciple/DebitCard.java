package com.haleluque.low.level.design.SOLIDprinciples.openClosePrinciple;

public class DebitCard implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Paid with debit card: " + amount);
    }
}
