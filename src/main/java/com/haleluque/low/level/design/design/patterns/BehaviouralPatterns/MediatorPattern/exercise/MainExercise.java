package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.MediatorPattern.exercise;

import java.util.Scanner;

public class MainExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ControlTower controlTower = new ControlTower();

        String airplaneId1 = sc.nextLine();
        String airplaneId2 = sc.nextLine();
        String airplaneId3 = sc.nextLine();
        String airplaneId4 = sc.nextLine();

        Airplane airplane1 = new Airplane(airplaneId1);
        Airplane airplane2 = new Airplane(airplaneId2);
        Airplane airplane3 = new Airplane(airplaneId3);
        Airplane airplane4 = new Airplane(airplaneId4);

        controlTower.registerAirplane(airplane1);
        controlTower.registerAirplane(airplane2);
        controlTower.registerAirplane(airplane3);
        controlTower.registerAirplane(airplane4);

        airplane1.requestTakeoff();
        airplane2.requestTakeoff();
        airplane3.requestTakeoff();
        airplane4.requestTakeoff();

        controlTower.completeTakeoff(airplane1);
        controlTower.completeTakeoff(airplane2);

        airplane3.requestTakeoff();
        airplane4.requestTakeoff();

        controlTower.completeTakeoff(airplane3);
        controlTower.completeTakeoff(airplane4);

        airplane1.requestLanding();
        airplane2.requestLanding();

        controlTower.completeLanding(airplane1);
        controlTower.completeLanding(airplane2);

        airplane3.requestLanding();
        airplane4.requestLanding();

        controlTower.completeLanding(airplane3);
        controlTower.completeLanding(airplane4);

        sc.close();
    }
}
