package com.haleluque.low.level.design.SOLIDprinciples.liskovSubstitution.badCode;

public class ReadOnly extends FileBadCode {
    @Override
    public void write() {
        throw new UnsupportedOperationException("Can't write to a readonly file");
    }
}
