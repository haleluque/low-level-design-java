package com.haleluque.low.level.design.SOLIDprinciples.interfaceSegregation;

public class SimplePrinterCorrect implements Printer{
    @Override
    public void print() {
        System.out.println("prints");
    }
}
