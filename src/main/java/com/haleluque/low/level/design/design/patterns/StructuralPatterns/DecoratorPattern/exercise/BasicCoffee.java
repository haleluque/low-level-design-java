package com.haleluque.low.level.design.design.patterns.StructuralPatterns.DecoratorPattern.exercise;

/**
 * Concrete component, class that will be decorated
 */
public class BasicCoffee implements Coffee {

    @Override
    public String getDescription() {
        return "Basic Coffee";
    }

    @Override
    public double getCost() {
        return 3.00;
    }
}
