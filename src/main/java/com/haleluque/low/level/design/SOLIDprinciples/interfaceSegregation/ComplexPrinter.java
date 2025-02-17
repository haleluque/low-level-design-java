package com.haleluque.low.level.design.SOLIDprinciples.interfaceSegregation;

public class ComplexPrinter implements Printer, Scanner, CopyMachine {
    @Override
    public void copy() {
        System.out.println("copy");
    }

    @Override
    public void print() {
        System.out.println("prints");
    }

    @Override
    public void scan() {
        System.out.println("scans");
    }
}
