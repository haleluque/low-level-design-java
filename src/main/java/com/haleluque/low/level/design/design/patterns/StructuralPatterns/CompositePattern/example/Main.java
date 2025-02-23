package com.haleluque.low.level.design.design.patterns.StructuralPatterns.CompositePattern.example;

/**
 * The Composite Pattern allows you to compose objects into tree-like structures to represent part-whole hierarchies.
 * It lets clients treat individual objects and compositions of objects uniformly.
 * This pattern is especially useful when you want to manipulate a group of objects in the same way as a single object.
 */
public class Main {
    public static void main(String[] args) {
        FileSystemComponent file1 = new File("File1.txt");
        FileSystemComponent file2 = new File("File2.txt");
        Folder folder = new Folder("Documents");
        folder.addComponent(file1);
        folder.addComponent(file2);

        //Subfolder
        Folder subFolder = new Folder("Work");
        FileSystemComponent subFile1 = new File("report1.txt");
        FileSystemComponent subFile2 = new File("report2.txt");
        subFolder.addComponent(subFile1);
        subFolder.addComponent(subFile2);
        folder.addComponent(subFolder);

        //Another sub folder
        Folder subSubFolder = new Folder("Accounting");
        FileSystemComponent subSubFile1 = new File("accounting2025.txt");
        subSubFolder.addComponent(subSubFile1);
        subFolder.addComponent(subSubFolder);

        //Show All hierarchy
        folder.showDetails();
    }
}
