package com.haleluque.low.level.design.design.patterns.StructuralPatterns.DecoratorPattern.exampleWithout;

public class CheeseOlivePizzaW extends CheesePizzaW {

    @Override
    public String getDescription() {
        return super.getDescription() + ", Olives";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.50;
    }
}