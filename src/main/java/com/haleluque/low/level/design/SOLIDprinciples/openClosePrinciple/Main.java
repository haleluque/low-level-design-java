package com.haleluque.low.level.design.SOLIDprinciples.openClosePrinciple;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        CreditCard creditCard = new CreditCard();
        DebitCard debitCard = new DebitCard();

        //Runtime polymorphism
        paymentProcessor.pay(creditCard, 123);
        paymentProcessor.pay(debitCard, 654);

        //Adds extra logic without affecting the original
        Paypal paypal = new Paypal();
        paymentProcessor.pay(paypal, 456);

    }
}
