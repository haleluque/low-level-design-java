package com.haleluque.low.level.design.design.patterns.StructuralPatterns.ProxyPattern.exampleWithout;

public class MainW {
    public static void main(String[] args) {
        //Here, the RealImage is loaded every time we create it,
        // which can be inefficient if the image is not always required.
        ImageW img1 = new RealImageW("dog.png");
        ImageW img2 = new RealImageW("cat.png");
        img1.display();
        img2.display();
    }
}
