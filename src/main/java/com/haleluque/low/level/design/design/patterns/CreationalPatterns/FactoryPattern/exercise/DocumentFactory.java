package com.haleluque.low.level.design.design.patterns.CreationalPatterns.FactoryPattern.exercise;

public class DocumentFactory {
    public static Document createDocument(String type) {
        return switch (type.toLowerCase()) {
            case "pdf" -> new PDFDocument();
            case "word" -> new WordDocument();
            case "html" -> new HTMLDocument();
            default -> throw new IllegalArgumentException("Unknown document type: " + type);
        };
    }
}