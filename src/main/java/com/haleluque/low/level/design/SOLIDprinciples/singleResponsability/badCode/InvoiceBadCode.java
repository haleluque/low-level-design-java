package com.haleluque.low.level.design.SOLIDprinciples.singleResponsability.badCode;

/**
 * A class should have only one reason to change, meaning it should only have
 * one responsibility
 * <p>
 * Split in many classes, objects in order to separate concerns
 */
public class InvoiceBadCode {
    private double amount;

    public InvoiceBadCode(double amount) {
        this.amount = amount;
    }

    //Additional Functionality
    public void generateInvoice() {
        System.out.println("Invoice generated with amount " + amount);
    }

    public void saveToDatabase() {
        System.out.println("Invoice saved in database with amount " + amount);
    }

    public void sendEmailNotification() {
        System.out.println("Email sent with invoice info with amount " + amount);
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
