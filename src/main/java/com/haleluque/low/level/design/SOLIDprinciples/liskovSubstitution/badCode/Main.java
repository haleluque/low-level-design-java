package com.haleluque.low.level.design.SOLIDprinciples.liskovSubstitution.badCode;


public class Main {
    public static void main(String[] args) {
        FileBadCode file = new ReadOnly();
        file.read();
        file.write(); //crashes
    }
}
