package com.haleluque.low.level.design.design.patterns.CreationalPatterns.FactoryPattern.example;

public class TransportFactory {
    //static method, not create TransportFactory but Transport
    public static Transport createTransport(String transportType) {
        return switch (transportType.toLowerCase()) {
            case "car" -> new Car();
            case "train" -> new Train();
            case "bus" -> new Bus();
            default -> throw new IllegalArgumentException("Unsupported transportation type: " + transportType);
        };
    }
}
