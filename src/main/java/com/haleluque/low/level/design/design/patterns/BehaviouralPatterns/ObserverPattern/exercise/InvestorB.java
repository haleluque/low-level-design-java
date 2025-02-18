package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.ObserverPattern.exercise;

public class InvestorB implements Observer {
    @Override
    public void update(String stockSymbol, double newPrice) {
        System.out.println("Investor B notified: Stock " + stockSymbol + " has a new price: $" + newPrice);
    }
}