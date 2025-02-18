package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.CommandPattern.example;

/**
 * Concrete Command
 */
public class BoldCommand implements Command {
    private final TextEditor textEditor;

    public BoldCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        textEditor.boldText();
    }
}
