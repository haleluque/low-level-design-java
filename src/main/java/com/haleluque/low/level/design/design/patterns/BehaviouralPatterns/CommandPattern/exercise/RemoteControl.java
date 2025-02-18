package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.CommandPattern.exercise;

import com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.CommandPattern.example.Command;

public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton(){
        command.execute();
    }
}
