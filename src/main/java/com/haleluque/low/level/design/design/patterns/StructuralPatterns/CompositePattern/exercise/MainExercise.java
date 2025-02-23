package com.haleluque.low.level.design.design.patterns.StructuralPatterns.CompositePattern.exercise;

import java.util.Scanner;

public class MainExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String appetizersSectionName = sc.nextLine();
        String mainCoursesSectionName = sc.nextLine();
        String dessertsSectionName = sc.nextLine();
        String seaFoodSectionName = sc.nextLine();

        MenuSection appetizers = new MenuSection(appetizersSectionName);
        MenuSection mainCourses = new MenuSection(mainCoursesSectionName);
        MenuSection desserts = new MenuSection(dessertsSectionName);
        MenuSection seafood = new MenuSection(seaFoodSectionName);

        for (int i = 0; i < 2; i++) {
            String name = sc.nextLine();
            String description = sc.nextLine();
            double price = sc.nextDouble();
            sc.nextLine();
            MenuComponent appetizer = new MenuItem(name, description, price);
            appetizers.add(appetizer);
        }

        // Get user input for main courses
        for (int i = 0; i < 2; i++) {
            String name = sc.nextLine();
            String description = sc.nextLine();
            double price = sc.nextDouble();
            sc.nextLine();
            MenuComponent mainCourse = new MenuItem(name, description, price);
            mainCourses.add(mainCourse);

        }

        // Get user input for desserts
        for (int i = 0; i < 2; i++) {
            String name = sc.nextLine();
            String description = sc.nextLine();
            double price = sc.nextDouble();
            sc.nextLine();
            MenuComponent dessert = new MenuItem(name, description, price);
            desserts.add(dessert);
        }

        mainCourses.add(seafood);

        MenuSection fullMenu = new MenuSection("Restaurant Menu");
        fullMenu.add(appetizers);
        fullMenu.add(mainCourses);
        fullMenu.add(desserts);
        System.out.println("\nFull Menu:");
        fullMenu.print();


        sc.close();
    }
}
