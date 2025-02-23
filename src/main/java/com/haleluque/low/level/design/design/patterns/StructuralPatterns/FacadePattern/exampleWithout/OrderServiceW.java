package com.haleluque.low.level.design.design.patterns.StructuralPatterns.FacadePattern.exampleWithout;

// Microservice for Order Management
class OrderServiceW {
    public String getOrderDetails(String orderId) {
        // Simulate fetching order details
        return "Order details for orderId: " + orderId;
    }
}