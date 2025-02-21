package com.haleluque.low.level.design.design.patterns.StructuralPatterns.DecoratorPattern.example;

/**
 * Concrete Component
 */
public class BasicPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Basic Pizza";

    }

    @Override
    public double getCost() {
        return 5.00; //base cost
    }
}
