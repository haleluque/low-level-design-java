package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.MediatorPattern.exercise;

public class Airplane {
    private final String id;
    private Mediator mediator;

    public Airplane(String id) {
        this.id = id;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void requestTakeoff() {
        System.out.println("Airplane " + id + " requesting takeoff");
        mediator.handleTakeoffRequest(this);
    }

    public void requestLanding() {
        System.out.println("Airplane " + id + " requesting landing");
        mediator.handleLandingRequest(this);
    }

    public void receiveNotification(String message) {
        System.out.println("Airplane " + id + ": " + message);
    }

    public String getId() {
        return id;
    }
}