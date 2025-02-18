package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.ObserverPattern.exampleWithout;

public class WeatherStation {
    private float temperature;
    private final DisplayDevice displayDevice; //tight coupling

    public WeatherStation(DisplayDevice displayDevice) {
        this.displayDevice = displayDevice;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyDevice();
    }

    public void notifyDevice() {
        displayDevice.showTemp(temperature);
    }
}
