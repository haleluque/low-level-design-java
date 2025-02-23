package com.haleluque.low.level.design.design.patterns.StructuralPatterns.FacadePattern.exercise;

import java.util.Scanner;

public class MainExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HomeTheaterFacade homeTheater = new HomeTheaterFacade();
        int dimmingPercentage = sc.nextInt();
        int volumeLevel = sc.nextInt();
        homeTheater.watchMovie(dimmingPercentage, volumeLevel);
        sc.close();
    }
}
