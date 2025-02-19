package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.StatePattern.example;

/**
 * Context class
 */
public class DirectionService {
    private TransportationMode transportationMode;

    public DirectionService(TransportationMode transportationMode) {
        this.transportationMode = transportationMode;
    }

    public void setMode(TransportationMode mode){
        this.transportationMode = mode;
    }

    //Delegating the work to the current state's concrete class
    public int getETA(){
        return transportationMode.calcETA();
    }

    public String getDirections(){
        return transportationMode.getDirections();
    }
}
