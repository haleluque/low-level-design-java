package com.haleluque.low.level.design.design.patterns.StructuralPatterns.FacadePattern.exampleWithout;

public class MainW {
    public static void main(String[] args) {
        // Client code interacting with different services directly
        UserServiceW userService = new UserServiceW();
        OrderServiceW orderService = new OrderServiceW();
        PaymentServiceW paymentService = new PaymentServiceW();

        //Task
        System.out.println(userService.getUserDetails("123"));
        System.out.println(orderService.getOrderDetails("456"));
        System.out.println(paymentService.processPayment("789"));
    }
}
