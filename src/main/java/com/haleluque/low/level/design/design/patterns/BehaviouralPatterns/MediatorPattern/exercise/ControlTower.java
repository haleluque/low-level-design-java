package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.MediatorPattern.exercise;

import java.util.ArrayList;
import java.util.List;

public class ControlTower implements Mediator {
    private final List<Airplane> airplanes;
    private int takeoffRunways;
    private int landingRunways;

    public ControlTower() {
        airplanes = new ArrayList<>();
        this.takeoffRunways = 2;
        this.landingRunways = 2;
    }

    @Override
    public void registerAirplane(Airplane airplane) {
        airplanes.add(airplane);
        airplane.setMediator(this);
    }

    @Override
    public void handleTakeoffRequest(Airplane airplane) {
        if (takeoffRunways > 0) {
            takeoffRunways--;
            notifyAirplane(airplane, "Takeoff approved. Runways available: " + takeoffRunways);
        } else {
            notifyAirplane(airplane, "Takeoff denied. No runways available. Please wait");
        }
    }

    @Override
    public void handleLandingRequest(Airplane airplane) {
        if (landingRunways > 0) {
            landingRunways--;
            notifyAirplane(airplane, "Landing approved. Runways available: " + landingRunways);
        } else {
            notifyAirplane(airplane, "Landing denied. No runways available. Please wait");
        }
    }

    // Simulate the completion of takeoff and free the runway
    public void completeTakeoff(Airplane airplane) {
        System.out.println("Airplane " + airplane.getId() + " has taken off");
        takeoffRunways++;
        System.out.println("Runway freed. Available takeoff runways: " + takeoffRunways);
    }

    // Simulate the completion of landing and free the runway
    public void completeLanding(Airplane airplane) {
        System.out.println("Airplane " + airplane.getId() + " has landed");
        landingRunways++;
        System.out.println("Runway freed. Available landing runways: " + landingRunways);
    }

    private void notifyAirplane(Airplane airplane, String message) {
        airplane.receiveNotification(message);
        //notifies all the other airplanes the message
        airplanes.stream()
                .filter(airplane1 -> airplane1 != airplane)
                .forEach(airplane1 -> airplane1.receiveNotification(message));
    }
}
