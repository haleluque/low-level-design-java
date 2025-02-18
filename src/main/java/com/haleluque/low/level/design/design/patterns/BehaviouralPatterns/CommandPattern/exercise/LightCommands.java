package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.CommandPattern.exercise;

import com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.CommandPattern.example.Command;

public class LightCommands {
    public static class LightOnCommand implements Command {

        private final Light light;

        public LightOnCommand(Light light) {
            this.light = light;
        }

        @Override
        public void execute() {
            light.turnOn();
        }
    }

    public static class LightOffCommand implements Command {
        private final Light light;

        public LightOffCommand(Light light) {
            this.light = light;
        }

        @Override
        public void execute() {
            light.turnOff();
        }

    }
}
