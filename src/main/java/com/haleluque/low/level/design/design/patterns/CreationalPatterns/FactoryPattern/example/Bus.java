package com.haleluque.low.level.design.design.patterns.CreationalPatterns.FactoryPattern.example;

public class Bus implements Transport{
    @Override
    public void deliver() {
        System.out.println("Deliver by bus");
    }
}
