package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.ObserverPattern.example;

public interface SubjectWeatherStation {
    void attach(ObserverDevice observer);
    void detach(ObserverDevice observer);
    void notifyObservers();
}
