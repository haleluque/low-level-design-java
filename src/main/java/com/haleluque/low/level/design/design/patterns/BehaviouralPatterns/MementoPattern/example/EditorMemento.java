package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.MementoPattern.example;

/**
 * Memento class: stores the internal state of the TextEditor (Originator)
 * Using a Record as the memento class is an immutable class (readonly objects introduced in java 14).
 */
public record EditorMemento(String content) {}
