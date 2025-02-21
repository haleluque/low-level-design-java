package com.haleluque.low.level.design.design.patterns.StructuralPatterns.ProxyPattern.exercise;

import java.util.Scanner;

public class MainExercise {
    public static void main(String[] args) {
        NetworkService networkService = new NetworkServiceProxy();
        Scanner sc = new Scanner(System.in);

        String userInput = sc.nextLine();
        System.out.println(networkService.fetchData(userInput));
        System.out.println(networkService.fetchData(userInput));
        sc.close();
    }
}
