package com.haleluque.low.level.design.SOLIDprinciples.openClosePrinciple.badCode;

/**
 * Software entities, classes, modules, functions should be open for extension but closed for modification
 * <p>
 * Use inheritance or composition for adding new functionalities without modifying existing code
 */
public class PaymentProcessorBadCode {
    public void processPayment(String paymentMethod, double amount) {
        if (paymentMethod.equals("CreditCard")) {
            //business logic
            System.out.println("Paid with credit card: " + amount);
        }
        else if (paymentMethod.equals("DebitCard")) {
            System.out.println("Paid with debit card: " + amount);
        }
        else {
            throw new IllegalArgumentException("Unsupported payment method : " + paymentMethod);
        }
    }
}
