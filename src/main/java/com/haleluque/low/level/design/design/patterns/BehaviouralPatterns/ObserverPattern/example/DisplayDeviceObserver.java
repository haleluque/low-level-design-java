package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.ObserverPattern.example;

public class DisplayDeviceObserver implements ObserverDevice {
    private final String name;

    public DisplayDeviceObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(float temperature) {
        System.out.println("Temp on device : "  + name + " is " + temperature);
    }
}
