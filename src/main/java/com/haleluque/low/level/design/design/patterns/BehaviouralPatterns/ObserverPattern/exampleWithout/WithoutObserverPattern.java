package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.ObserverPattern.exampleWithout;

public class WithoutObserverPattern {
    public static void main(String[] args) {
        DisplayDevice displayDevice = new DisplayDevice();
        WeatherStation weatherStation = new WeatherStation(displayDevice);
        //Tight coupling
        weatherStation.setTemperature(26);
        weatherStation.setTemperature(30);
    }
}
