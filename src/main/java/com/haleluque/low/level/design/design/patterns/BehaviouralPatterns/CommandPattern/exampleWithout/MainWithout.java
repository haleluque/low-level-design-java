package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.CommandPattern.exampleWithout;

public class MainWithout {
    public static void main(String[] args) {
        TextEditorWithout textEditorWithout = new TextEditorWithout();
        BoldButtonWithout boldButtonWithout = new BoldButtonWithout(textEditorWithout);
        boldButtonWithout.click();
        ItalicButtonWithout italicButtonWithout = new ItalicButtonWithout(textEditorWithout);
        italicButtonWithout.click();
    }
}
