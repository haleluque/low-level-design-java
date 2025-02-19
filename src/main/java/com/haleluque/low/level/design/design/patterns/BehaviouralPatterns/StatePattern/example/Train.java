package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.StatePattern.example;

public class Train implements TransportationMode{
    @Override
    public int calcETA() {
        System.out.println("Calc ETA for cycling 3");
        return 3;
    }

    @Override
    public String getDirections() {
        return "Directions for train: Board the Red Line at Central Station.";
    }
}
