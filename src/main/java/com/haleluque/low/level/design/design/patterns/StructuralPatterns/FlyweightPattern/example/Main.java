package com.haleluque.low.level.design.design.patterns.StructuralPatterns.FlyweightPattern.example;

/**
 * The Flyweight Pattern is a structural design pattern that aims to minimize memory usage by sharing as much data as
 * possible with similar objects.
 * It is particularly useful when you need to create a large number of similar objects. The key idea is to use a shared
 * object to support a large number of fine-grained objects efficiently.
 */
public class Main {
    public static void main(String[] args) {
        // 5 Red Bullet Objects
        for(int i=0;i<5;i++){
            Bullet bullet = new Bullet("Red",i*10,i*12,5);
        }
        // 5 Green Bullet Objects
        for(int i=0;i<5;i++){
            Bullet bullet = new Bullet("Red",i*10,i*12,5);
        }
        //Optimized the repetition of similar properties.
    }
}