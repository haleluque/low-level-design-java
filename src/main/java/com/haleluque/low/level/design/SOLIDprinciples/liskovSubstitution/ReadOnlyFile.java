package com.haleluque.low.level.design.SOLIDprinciples.liskovSubstitution;

public class ReadOnlyFile implements Readable {
    @Override
    public void read() {
        System.out.println("Reading from the file...");
    }
}
