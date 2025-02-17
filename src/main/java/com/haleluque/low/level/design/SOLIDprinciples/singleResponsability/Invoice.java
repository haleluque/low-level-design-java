package com.haleluque.low.level.design.SOLIDprinciples.singleResponsability;


public class Invoice {
    private double amount;

    public Invoice(double amount) {
        this.amount = amount;
    }

    //Additional Functionality
    public void generateInvoice() {
        System.out.println("Invoice generated with amount " + amount);
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
