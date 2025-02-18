package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.CommandPattern.example;

/**
 * Invoker Class, able to receive N commands of different implementations
 */
public class Button {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton(){
        command.execute();
    }
}
