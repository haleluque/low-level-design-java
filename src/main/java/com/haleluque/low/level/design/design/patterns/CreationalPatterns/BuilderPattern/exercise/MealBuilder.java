package com.haleluque.low.level.design.design.patterns.CreationalPatterns.BuilderPattern.exercise;

public class MealBuilder {
    private final String mainDish;
    private final String sideDish;
    private final String drink;
    private String dessert = "Default Dessert";
    private String appetizer = "Default Appetizer";

    public MealBuilder(String mainDish, String sideDish, String drink) {
        this.mainDish = mainDish;
        this.sideDish = sideDish;
        this.drink = drink;
    }

    public MealBuilder setDessert(String dessert) {
        this.dessert = dessert;
        return this;
    }

    public MealBuilder setAppetizer(String appetizer) {
        this.appetizer = appetizer;
        return this;
    }

    public Meal build() {
        return Meal.getInstance(this);
    }

    public String getMainDish() {
        return mainDish;
    }

    public String getSideDish() {
        return sideDish;
    }

    public String getDrink() {
        return drink;
    }

    public String getDessert() {
        return dessert;
    }

    public String getAppetizer() {
        return appetizer;
    }
}