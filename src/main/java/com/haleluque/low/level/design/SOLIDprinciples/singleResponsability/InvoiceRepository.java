package com.haleluque.low.level.design.SOLIDprinciples.singleResponsability;

public class InvoiceRepository {
    public void saveToDatabase(String amount) {
        System.out.println("Invoice saved in database with amount " + amount);
    }
}
