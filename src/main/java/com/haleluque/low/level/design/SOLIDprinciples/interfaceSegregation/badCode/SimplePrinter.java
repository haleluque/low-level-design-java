package com.haleluque.low.level.design.SOLIDprinciples.interfaceSegregation.badCode;

public class SimplePrinter implements Machine {
    @Override
    public void print(Document doc) {
        System.out.println("prints");
    }

    @Override
    public void scan(Document doc) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public void copy(Document doc) {
        throw new UnsupportedOperationException("not supported");
    }
}
