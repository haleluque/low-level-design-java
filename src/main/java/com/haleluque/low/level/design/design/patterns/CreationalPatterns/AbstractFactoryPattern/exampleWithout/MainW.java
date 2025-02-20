package com.haleluque.low.level.design.design.patterns.CreationalPatterns.AbstractFactoryPattern.exampleWithout;

class WindowsButtonW {
    public void render() {
        System.out.println("Rendering windows button");
    }
}

class WindowsScrollBarW {
    public void scroll() {
        System.out.println("Rendering windows scrollbar");
    }
}

//Mac UI components
class MacOSButtonW {
    public void render() {
        System.out.println("Rendering MacOS button");
    }
}

class MacOSScrollBarW {
    public void scroll() {
        System.out.println("Rendering MacOS scrollbar");
    }
}


public class MainW {
    public static void main(String[] args) {
        //Windows UI
        WindowsButtonW button = new WindowsButtonW();
        WindowsScrollBarW scrollBar = new WindowsScrollBarW();
        //Mac UI
        button.render();
        scrollBar.scroll();
    }
}