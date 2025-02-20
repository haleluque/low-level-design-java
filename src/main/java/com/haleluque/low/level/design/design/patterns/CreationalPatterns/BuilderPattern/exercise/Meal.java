package com.haleluque.low.level.design.design.patterns.CreationalPatterns.BuilderPattern.exercise;

public class Meal {
    private final String mainDish;
    private final String sideDish;
    private final String drink;
    private final String dessert;
    private final String appetizer;

    private Meal(MealBuilder builder) {
        this.mainDish = builder.getMainDish();
        this.sideDish = builder.getSideDish();
        this.drink = builder.getDrink();
        this.dessert = builder.getDessert();
        this.appetizer = builder.getAppetizer();
    }

    public static Meal getInstance(MealBuilder builder) {
        return new Meal(builder);
    }

    public void printMealSummary() {
        System.out.println("Main Dish: " + mainDish);
        System.out.println("Side Dish: " + sideDish);
        System.out.println("Drink: " + drink);
        System.out.println("Dessert: " + dessert);
        System.out.println("Appetizer: " + appetizer);
    }
}