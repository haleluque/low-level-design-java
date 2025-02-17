package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.MementoPattern.example;

/**
 * The memento pattern captures the internal state of an object in a memento, allowing the object to restore
 * its state later on without revealing internal details and without breaking encapsulation
 * <p>
 * Common uses:
 * - Applications that requires history management
 * - Applications where a state needs to be saved periodically, and allowing users to return to previous states
 * - Games and Document Editors
 * <p>
 * A potential drawback of the Memento pattern is high memory usage if many states of an object are stored.
 * This can be particularly problematic for applications that need to keep track of a large number of states over time.
 */
public class TextEditorMain {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        Caretaker caretaker = new Caretaker(); // History of states
        textEditor.write("Hello World");
        caretaker.saveState(textEditor);
        textEditor.write("Hello Changed");
        caretaker.saveState(textEditor);

        //Undo the last change and return the original text
        caretaker.undo(textEditor);
        System.out.println(textEditor.getContent());

    }
}
