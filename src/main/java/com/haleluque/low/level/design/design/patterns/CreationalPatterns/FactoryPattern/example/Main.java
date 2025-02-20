package com.haleluque.low.level.design.design.patterns.CreationalPatterns.FactoryPattern.example;

/**
 * The factory Pattern centralizes the creation logic and delegates the responsibility of creating objects to
 * factory classes, which decide the specific class to instantiate. This allows to adhere to the Open/Closed principle
 * by letting new types of implementations be added without modifying the existing code.
 * It centralizes the object creation logic, reducing coupling.
 * <p>
 * Common use cases:
 * - Database connectivity: choosing different types of databases
 * - Document conversion tool: formating document (HTML, PDF, Word)
 * <p>
 * The Factory Method pattern creates individual products, while the Abstract Factory pattern
 * is used for creating families of related or dependent products through a higher level of abstraction.
 */
public class Main {
    public static void main(String[] args) {
        //we create the concrete implementation though the factory class
        Transport vehicle = TransportFactory.createTransport("car");
        vehicle.deliver();
    }
}
