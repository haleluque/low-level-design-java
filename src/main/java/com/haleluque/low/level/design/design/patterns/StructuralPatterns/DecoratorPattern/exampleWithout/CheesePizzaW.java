package com.haleluque.low.level.design.design.patterns.StructuralPatterns.DecoratorPattern.exampleWithout;

public class CheesePizzaW extends BasicPizzaW {
    @Override
    public String getDescription() {
        return super.getDescription() + ", Cheese";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.00;
    }
}
