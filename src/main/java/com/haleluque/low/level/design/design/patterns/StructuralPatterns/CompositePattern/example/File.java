package com.haleluque.low.level.design.design.patterns.StructuralPatterns.CompositePattern.example;

/**
 * Leaf Class
 */
public class File implements FileSystemComponent{
    private final String name;

    public File(String name){
        this.name = name;
    }

    @Override
    public void showDetails(){
        System.out.println("File : " +name);
    }
}
