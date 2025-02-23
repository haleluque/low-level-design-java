package com.haleluque.low.level.design.design.patterns.StructuralPatterns.CompositePattern.exampleWithout;

public class FileW {
    private final String name;

    public FileW(String name){
        this.name = name;
    }

    public void showDetails(){
        System.out.println("File : " +name);
    }
}