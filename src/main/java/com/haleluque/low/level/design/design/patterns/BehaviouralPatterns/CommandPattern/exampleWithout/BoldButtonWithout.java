package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.CommandPattern.exampleWithout;

public class BoldButtonWithout {
    private final TextEditorWithout textEditorWithout;

    public BoldButtonWithout(TextEditorWithout textEditorWithout) {
        this.textEditorWithout = textEditorWithout;
    }

    public void click(){
        textEditorWithout.boldText();
    }
}
