package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.MementoPattern.example;

import java.util.Stack;

public class Caretaker {
    private final Stack<EditorMemento> history = new Stack<>();

    public void saveState(TextEditor editor) {
        history.push(editor.save());
    }

    public void undo(TextEditor editor) {
        if (!history.empty()) {
            history.pop(); //removes the last added item
            editor.restore(history.peek());// get the top item in the stack without removing it
        }
    }
}
