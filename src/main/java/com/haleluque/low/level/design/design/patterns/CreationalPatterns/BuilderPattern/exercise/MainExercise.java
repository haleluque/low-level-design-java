package com.haleluque.low.level.design.design.patterns.CreationalPatterns.BuilderPattern.exercise;

import java.util.Scanner;

public class MainExercise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get full meal components from user
        String fullMainDish = sc.nextLine();
        String fullSideDish = sc.nextLine();
        String fullDrink = sc.nextLine();
        String fullDessert = sc.nextLine();
        String fullAppetizer = sc.nextLine();

        MealBuilder meatBuilder = new
                MealBuilder(fullMainDish, fullSideDish, fullDrink)
                    .setDessert(fullDessert)
                    .setAppetizer(fullAppetizer);
        Meal meal = meatBuilder.build();

        System.out.println("Full Meal Summary:");

        meal.printMealSummary();


        // Get simple meal components from user
        String simpleMainDish = sc.nextLine();
        String simpleSideDish = sc.nextLine();
        String simpleDrink = sc.nextLine();

        meatBuilder = new MealBuilder(simpleMainDish, simpleSideDish, simpleDrink);
        meal = meatBuilder.build();

        System.out.println("Simple Meal Summary:");

        meal.printMealSummary();

        sc.close();
    }
}
