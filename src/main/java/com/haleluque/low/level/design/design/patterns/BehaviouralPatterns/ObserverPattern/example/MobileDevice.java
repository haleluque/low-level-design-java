package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.ObserverPattern.example;

public class MobileDevice implements ObserverDevice {
    @Override
    public void update(float temperature) {
        System.out.println("Temp on mobile is " + temperature);
    }
}
