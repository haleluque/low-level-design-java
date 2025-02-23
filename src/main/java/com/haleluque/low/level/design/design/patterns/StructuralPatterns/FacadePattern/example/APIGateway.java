package com.haleluque.low.level.design.design.patterns.StructuralPatterns.FacadePattern.example;

public class APIGateway {
    OrderService orderService;
    UserService userService;
    PaymentService paymentService;

    public APIGateway() {
        this.orderService = new OrderService();
        this.userService = new UserService();
        this.paymentService = new PaymentService();
    }

    //Task
    public String getFullOrderDetails(String userId, String orderId, String paymentId) {
        String userDetails = userService.getUserDetails(userId);
        String oderDetails = orderService.getOrderDetails(orderId);
        String paymentDetails = paymentService.processPayment(paymentId);

        return userDetails + "\n" + oderDetails + "\n" + paymentDetails;
    }
}
