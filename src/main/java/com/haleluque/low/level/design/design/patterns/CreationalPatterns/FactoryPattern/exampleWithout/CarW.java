package com.haleluque.low.level.design.design.patterns.CreationalPatterns.FactoryPattern.exampleWithout;

public class CarW implements TransportW {
    @Override
    public void deliver() {
        System.out.println("Deliver by car");
    }
}
