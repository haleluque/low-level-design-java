package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.CommandPattern.exercise;

import com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.CommandPattern.example.Command;

public class FanCommands {
    public static class FanOnCommand implements Command {
        private final Fan fan;

        public FanOnCommand(Fan fan) {
            this.fan = fan;
        }

        @Override
        public void execute() {
            fan.turnOn();
        }
    }

    public static class FanOffCommand implements Command {
        private final Fan fan;

        public FanOffCommand(Fan fan) {
            this.fan = fan;
        }

        @Override
        public void execute() {
            fan.turnOff();
        }

    }
}
