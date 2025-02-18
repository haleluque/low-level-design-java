package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.ObserverPattern.exercise;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers(String stockSymbol, double newPrice);
}
