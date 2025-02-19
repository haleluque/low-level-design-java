package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.StatePattern.example;

/**
 * Concrete Implementation
 */
public class Walking implements TransportationMode {
    @Override
    public int calcETA() {
        System.out.println("Calc ETA for walking");
        return 10;
    }

    @Override
    public String getDirections() {
        return "Directions for walking: Head north for 500 meters.";
    }
}
