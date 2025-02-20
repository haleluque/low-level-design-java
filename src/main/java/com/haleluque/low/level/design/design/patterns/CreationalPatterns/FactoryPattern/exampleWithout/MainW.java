package com.haleluque.low.level.design.design.patterns.CreationalPatterns.FactoryPattern.exampleWithout;

public class MainW {
    public static void main(String[] args) {
        //Main class (client) tightly coupled with concrete implementations
        TransportW car = new CarW();
        TransportW bike = new BikeW();
        TransportW bus = new BusW();
    }
}
