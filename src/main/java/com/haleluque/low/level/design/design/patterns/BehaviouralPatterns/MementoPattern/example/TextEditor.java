package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.MementoPattern.example;

/**
 * This is the Originator: object which state needs to be saved and restored
 * <p>
 * The Memento pattern respects encapsulation by allowing only the Originator to access and modify its internal state.
 * The Caretaker and other classes have no knowledge of the Originator’s state or structure.
 */
public class TextEditor {
    private String content;

    public void write(String text) {
        this.content = text;
    }

    public String getContent(){ return content; }

    /**
     * Saves the current state of the editor
     * @return The memento object
     */
    public EditorMemento save() {
        return new EditorMemento(content);
    }

    /**
     * Restore memento and update the content
     * @param memento class
     */
    public void restore(EditorMemento memento) {
        content = memento.content();
    }
}
