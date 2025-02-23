package com.haleluque.low.level.design.design.patterns.StructuralPatterns.CompositePattern.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite class
 */
public class Folder implements FileSystemComponent {
    private final String name;

    //Recursive structure, both files and folders
    private final List<FileSystemComponent> components = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent fileSystemComponent) {
        components.add(fileSystemComponent);
    }

    @Override
    public void showDetails() {
        System.out.println("Folder: " + name);
        components.forEach(FileSystemComponent::showDetails);
    }
}
