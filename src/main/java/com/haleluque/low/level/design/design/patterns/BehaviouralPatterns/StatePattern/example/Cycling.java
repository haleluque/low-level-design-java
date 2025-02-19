package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.StatePattern.example;

public class Cycling implements TransportationMode{
    @Override
    public int calcETA() {
        System.out.println("Calc ETA for cycling");
        return 5;
    }

    @Override
    public String getDirections() {
        return "Directions for cycling: Take the bike lane on Elm Street.";
    }
}
