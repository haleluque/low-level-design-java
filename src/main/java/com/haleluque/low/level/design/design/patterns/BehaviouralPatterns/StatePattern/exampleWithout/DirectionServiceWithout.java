package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.StatePattern.exampleWithout;

public class DirectionServiceWithout {
    private TransportationModeEnum mode;

    public DirectionServiceWithout(TransportationModeEnum mode){
        this.mode = mode;
    }

    public void setMode(TransportationModeEnum mode){
        this.mode = mode;
    }

    //Method to calc ETA based upon transportation Mode
    public void getETA() {
        switch (mode) {
            case WALKING -> {
                System.out.println("Calc ETA for walking 10");
            }
            case CYCLING -> {
                System.out.println("Calc ETA for cycling 5");
            }
            case CAR -> {
                System.out.println("Calc ETA for car 2");
            }
            case TRAIN -> {
                System.out.println("Calc ETA for cycling 3");
            }
            default -> throw new IllegalArgumentException("Unknown Mode");
        }
    }

    public String getDirection() {
        return switch (mode) {
            case WALKING -> "Directions for walking: Head north for 500 meters.";
            case CYCLING -> "Directions for cycling: Take the bike lane on Elm Street.";
            case CAR -> "Directions for driving: Use highway 50 towards downtown.";
            case TRAIN -> "Directions for train: Board the Red Line at Central Station.";
            default -> "No directions available for the selected mode.";
        };
    }
}
