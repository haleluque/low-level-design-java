package com.haleluque.low.level.design.design.patterns.CreationalPatterns.PrototypePattern.example;

public class GamePiece implements Prototype<GamePiece> {
    private String color;
    private int position;

    public GamePiece(String color, int position) {
        this.color = color;
        this.position = position;
    }

    public String getColor() {
        return color;
    }

    public int getPosition() {
        return position;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "GamePiece{" +
                "color='" + color + '\'' +
                ", position=" + position +
                '}';
    }

    @Override
    public GamePiece clone() {
        return new GamePiece(this.color, this.position);
    }
}
