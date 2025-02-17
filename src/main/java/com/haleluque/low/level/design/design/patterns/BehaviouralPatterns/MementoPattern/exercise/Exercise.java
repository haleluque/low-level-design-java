package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.MementoPattern.exercise;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GraphicEditor graphicEditor = new GraphicEditor();
        CaretakerExercise caretakerExercise = new CaretakerExercise();

        for (int i = 0; i < 3; i++) {
            String shape = sc.next();
            int x = sc.nextInt();
            int y = sc.nextInt();
            String color = sc.next();
            int size = sc.nextInt();

            // TODO: Update the graphic editor with the new shape attributes from user input.
            graphicEditor.setShape(shape, x, y, color, size);

            // TODO: Save the current state of the graphic editor to the history
            caretakerExercise.saveState(graphicEditor);

        }
        sc.close();

        // TODO: Implement the undo operation to revert to the previous shape state
        caretakerExercise.undo(graphicEditor);

        // TODO: Output the current shape attributes after the undo operation to verify the restored state.
        System.out.println(graphicEditor.getShape());
    }
}
