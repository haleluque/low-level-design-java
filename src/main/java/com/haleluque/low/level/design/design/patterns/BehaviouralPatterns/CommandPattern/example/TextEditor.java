package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.CommandPattern.example;

/**
 * Receiver class, the one that will perform the operation
 */
public class TextEditor {
    public void boldText() {
        System.out.println("text has been bolded");
    }

    public void italicizeText() {
        System.out.println("text has been italicized");
    }
}
