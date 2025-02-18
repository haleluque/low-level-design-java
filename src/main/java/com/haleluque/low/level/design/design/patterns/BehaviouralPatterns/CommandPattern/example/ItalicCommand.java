package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.CommandPattern.example;

public class ItalicCommand implements Command {
    private final TextEditor textEditor;

    public ItalicCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        textEditor.italicizeText();
    }
}
