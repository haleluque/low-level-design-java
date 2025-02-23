package com.haleluque.low.level.design.design.patterns.StructuralPatterns.FacadePattern.exercise;

public class SoundSystem {

    public void on() {
        System.out.println("Sound System: Turned on");
    }

    public void off() {
        System.out.println("Sound System: Turned off");
    }

    public void setVolume(int level) {
        System.out.println("Sound System: Volume set to " + level);
    }
}
