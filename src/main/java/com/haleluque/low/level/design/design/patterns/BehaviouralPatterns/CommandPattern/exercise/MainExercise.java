package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.CommandPattern.exercise;

import com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.CommandPattern.example.Command;

public class MainExercise {
    public static void main(String[] args) {
        // Create devices
        Light light = new Light();
        Fan fan = new Fan();

        // Create commands
        Command lightOn = new LightCommands.LightOnCommand(light);
        Command lightOff = new LightCommands.LightOffCommand(light);
        Command fanOn = new FanCommands.FanOnCommand(fan);
        Command fanOff = new FanCommands.FanOffCommand(fan);

        // Create remote control
        RemoteControl remoteControl = new RemoteControl();

        // Test the functionality
        remoteControl.setCommand(lightOn);
        remoteControl.pressButton();
        remoteControl.setCommand(lightOff);
        remoteControl.pressButton();
        remoteControl.setCommand(fanOn);
        remoteControl.pressButton();
        remoteControl.setCommand(fanOff);
        remoteControl.pressButton();


    }
}
