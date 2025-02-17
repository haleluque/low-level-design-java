package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.MementoPattern.exercise;

import java.util.Stack;

/**
 * Caretaker class: Manage mementos (snapshots of the TextEditor Class)
 * without modifying them
 */
public class CaretakerExercise {
    private final Stack<com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.MementoPattern.exercise.EditorMemento> history = new Stack<>();

    public void saveState(GraphicEditor graphicEditor) {
        history.push(graphicEditor.save());

    }

    public void undo(GraphicEditor graphicEditor){
        if(!history.empty()){
            history.pop();
            graphicEditor.restore(history.peek());
        }
    }
}
