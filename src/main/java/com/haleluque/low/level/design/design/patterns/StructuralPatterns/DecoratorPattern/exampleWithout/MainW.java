package com.haleluque.low.level.design.design.patterns.StructuralPatterns.DecoratorPattern.exampleWithout;

public class MainW {
    public static void main(String[] args) {
        //Class explosion, many children classes
        PizzaW pizza = new CheeseOlivePizzaW();
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());
    }
}
