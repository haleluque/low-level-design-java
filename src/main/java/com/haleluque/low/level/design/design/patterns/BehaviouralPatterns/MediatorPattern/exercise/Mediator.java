package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.MediatorPattern.exercise;

public interface Mediator {
    void registerAirplane(Airplane airplane);
    void handleTakeoffRequest(Airplane airplane);
    void handleLandingRequest(Airplane airplane);
}
