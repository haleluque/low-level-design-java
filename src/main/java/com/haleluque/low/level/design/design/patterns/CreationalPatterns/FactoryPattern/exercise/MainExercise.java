package com.haleluque.low.level.design.design.patterns.CreationalPatterns.FactoryPattern.exercise;

import java.util.Scanner;

public class MainExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String documentType = sc.nextLine();

        try {
            Document word = DocumentFactory.createDocument(documentType);
            word.displayType();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
