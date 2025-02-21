package com.haleluque.low.level.design.design.patterns.StructuralPatterns.DecoratorPattern.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Decorator Pattern adds behavior to an individual object dynamically without affecting the behavior of other
 * objects from the same class. It involves a set of decorator classes that are used to wrap concrete components.
 * The decorator class implements the same interface as the class it decorates.
 * <p>
 * The Decorator pattern allows you to extend an object's functionality at runtime without altering its structure,
 * enabling dynamic behavior enhancements.
 * <p>
 * - Component Interface: This is the common interface for both concrete components and decorators.
 * - Concrete Component: The class which is being decorated.
 * - Decorator: The abstract decorator class that implements the component interface and contains a reference to a component object.
 * - Concrete Decorators: Classes that extend the decorator class and add additional functionality.
 */
public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        //Basic Pizza
        Pizza basicPizza = new BasicPizza();

        //Add cheese
        basicPizza = new CheeseDecoratorClass(basicPizza);

        //Add olives
        basicPizza = new OliveDecorator(basicPizza);

        System.out.println(basicPizza.getDescription());
        System.out.println(basicPizza.getCost());
    }
}
