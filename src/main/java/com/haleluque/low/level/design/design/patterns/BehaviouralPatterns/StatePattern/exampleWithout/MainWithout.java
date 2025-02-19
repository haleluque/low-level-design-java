package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.StatePattern.exampleWithout;

public class MainWithout {
    public static void main(String[] args) {
        DirectionServiceWithout directionService = new DirectionServiceWithout(TransportationModeEnum.TRAIN);
        directionService.setMode(TransportationModeEnum.CAR);

        System.out.println(directionService.getDirection());
        directionService.getETA();
    }
}
