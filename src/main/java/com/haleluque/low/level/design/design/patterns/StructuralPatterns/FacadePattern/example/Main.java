package com.haleluque.low.level.design.design.patterns.StructuralPatterns.FacadePattern.example;

/**
 * The Facade Pattern provides a simplified interface to a complex subsystem. It allows you to hide the complexities
 * of the system and provide an easier way to interact with it.
 * This pattern is particularly useful when you want to reduce the dependencies of client code on internal
 * details of the subsystem.
 * <p>
 * Benefits:
 * - Simplified way of handling clients interactions
 * - Decoupled the client from the microservices code
 * - Centralized control for additional features, security logging etc.
 * - Consistency internal apis can grow over time, but client code won't change.
 * <p>
 *  This pattern is usually seen in large complex system, with microservices
 */
public class Main {
    public static void main(String[] args) {
        // Client code is decoupled
        // the gateway is a centralized control
        APIGateway gateway = new APIGateway();

        //Task
        System.out.println(gateway.getFullOrderDetails("123", "1", "abc"));
    }
}
