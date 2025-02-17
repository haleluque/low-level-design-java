package com.haleluque.low.level.design.SOLIDprinciples.liskovSubstitution;

public class Main {
    public static void main(String[] args) {
        File file = new File();
        file.read();
        file.write();

        ReadOnlyFile readOnlyFile = new ReadOnlyFile();
        readOnlyFile.read(); //only can read
        //readOnlyFile.write(); //cannot be called

        //We can send both classes to the method of reading
        readAnyFile(file);
        readAnyFile(readOnlyFile);
    }

    public static void readAnyFile(ReadOnlyFile readOnlyFile){
        readOnlyFile.read();
    }
}
