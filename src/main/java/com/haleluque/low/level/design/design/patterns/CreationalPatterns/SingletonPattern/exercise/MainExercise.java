package com.haleluque.low.level.design.design.patterns.CreationalPatterns.SingletonPattern.exercise;

import java.util.Scanner;

public class MainExercise {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Scanner sc = new Scanner(System.in);

        // Get an info message from the user
        System.out.print("Enter an info message: ");
        String infoMessage = sc.nextLine();
        logger.info(infoMessage);

        // Get a warning message from the user
        System.out.print("Enter a warning message: ");
        String warnMessage = sc.nextLine();
        logger.warn(warnMessage);

        // Get an error message from the user
        System.out.print("Enter an error message: ");
        String errorMessage = sc.nextLine();
        logger.error(errorMessage);

        sc.close();
    }
}
