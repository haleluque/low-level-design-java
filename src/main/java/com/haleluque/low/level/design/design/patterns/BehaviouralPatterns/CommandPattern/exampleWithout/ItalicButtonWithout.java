package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.CommandPattern.exampleWithout;

public class ItalicButtonWithout {
    private final TextEditorWithout textEditorWithout;

    public ItalicButtonWithout(TextEditorWithout textEditorWithout) {
        this.textEditorWithout = textEditorWithout;
    }

    public void click(){
        textEditorWithout.italicizeText();
    }
}
