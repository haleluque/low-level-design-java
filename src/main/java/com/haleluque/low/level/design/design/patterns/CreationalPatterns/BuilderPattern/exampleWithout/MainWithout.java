package com.haleluque.low.level.design.design.patterns.CreationalPatterns.BuilderPattern.exampleWithout;

public class MainWithout {
    public static void main(String[] args) {
        HouseWithout houseWithout = new HouseWithout("Concrete","Wood","Shingles",true,true,false);
        // Constructor Explosion -> Too Many Constructors
        // Difficult to understand and maintain this code
        System.out.println(houseWithout);
    }
}
