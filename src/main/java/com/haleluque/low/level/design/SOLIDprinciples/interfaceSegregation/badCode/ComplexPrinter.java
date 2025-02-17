package com.haleluque.low.level.design.SOLIDprinciples.interfaceSegregation.badCode;

public class ComplexPrinter implements Machine{
    @Override
    public void print(Document doc) {
        System.out.println("prints");
    }

    @Override
    public void scan(Document doc) {
        System.out.println("scans");
    }

    @Override
    public void copy(Document doc) {
        System.out.println("copy");
    }
}
