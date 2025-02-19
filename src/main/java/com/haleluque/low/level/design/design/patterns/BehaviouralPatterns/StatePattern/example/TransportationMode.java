package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.StatePattern.example;

/**
 * State Interface
 */
public interface TransportationMode {
    int calcETA();
    String getDirections();
}
