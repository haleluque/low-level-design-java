package com.haleluque.low.level.design.design.patterns.StructuralPatterns.CompositePattern.exampleWithout;

public class MainW {
    public static void main(String[] args) {
        FileW file1 = new FileW("File1.txt");
        FileW file2 = new FileW("File2.txt");
        FolderW folder = new FolderW("Documents");
        folder.addFile(file1);
        folder.addFile(file2);

        folder.showDetails();
    }
}
