package com.haleluque.low.level.design.design.patterns.StructuralPatterns.CompositePattern.exampleWithout;

import java.util.ArrayList;
import java.util.List;

public class FolderW {
    private final String name;
    private final List<FileW> files = new ArrayList<>();

    public FolderW(String name){
        this.name = name;
    }

    public void addFile(FileW file){
        files.add(file);
    }

    public void showDetails(){
        System.out.println("Folder: " + name);
        files.forEach(FileW::showDetails);
    }
}
