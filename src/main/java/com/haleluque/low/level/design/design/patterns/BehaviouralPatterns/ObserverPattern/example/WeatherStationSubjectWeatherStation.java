package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.ObserverPattern.example;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the Subject, receives N observers without the need of knowing their
 * concrete implementation, just notify them
 */
public class WeatherStationSubjectWeatherStation implements SubjectWeatherStation {
    private float temperature;
    private final List<ObserverDevice> observerList;

    public WeatherStationSubjectWeatherStation() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void attach(ObserverDevice observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(ObserverDevice observer) {
        observerList.remove(observer);
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(observer -> observer.update(temperature)); //runtime polymorphism
    }
}
