package com.haleluque.low.level.design.SOLIDprinciples.liskovSubstitution;

public class File extends ReadOnlyFile implements Writeable {
    @Override
    public void write() {
        System.out.println("Writing in file...");
    }
}
