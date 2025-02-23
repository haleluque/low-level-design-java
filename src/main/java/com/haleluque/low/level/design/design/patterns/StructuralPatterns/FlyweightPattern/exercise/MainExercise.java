package com.haleluque.low.level.design.design.patterns.StructuralPatterns.FlyweightPattern.exercise;

import java.util.Scanner;

public class MainExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Document doc = new Document();

        int numberOfCharacters = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numberOfCharacters; i++) {
            String character = sc.nextLine();
            String fontStyle = sc.nextLine();
            String color = sc.nextLine();
            int fontSize = sc.nextInt();
            sc.nextLine();
            doc.addCharacter(character, fontStyle, fontSize, color);
        }
        doc.render();
        sc.close();
    }
}
