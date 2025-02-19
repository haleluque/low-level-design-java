package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.StatePattern.example;

/**
 * The State Pattern allows an object to change its behavior when its internal state changes.
 * <p>
 * - Context: Holds a reference to the current state
 * - State: Interface for state-specific behavior
 * - Concrete State: Specific implementations of the State interface that represent a particular state of the context object
 * <p>
 * This pattern is particularly useful for implementing state machines or managing the behavior of an object that
 * can be in one of several states.
 * - Navigation UI, where navigation changes depending on if the user is logged in or not
 */
public class Main {
    public static void main(String[] args) {
        DirectionService directionService = new DirectionService(new Train());
        directionService.setMode(new Cycling());

        System.out.println(directionService.getDirections());
        directionService.getETA();

        //Change the mode again
        directionService.setMode(new Walking());

        System.out.println(directionService.getDirections());
        directionService.getETA();
    }
}
