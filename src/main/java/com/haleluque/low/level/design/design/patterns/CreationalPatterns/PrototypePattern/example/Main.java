package com.haleluque.low.level.design.design.patterns.CreationalPatterns.PrototypePattern.example;

/**
 * The Prototype design pattern is used to create new objects by copying an existing object, known as the prototype.
 * This pattern is useful when the cost of creating a new object is expensive or complex.
 * It ensures each object knows how to clone itself making the system flexible and easier to maintain.
 * <p>
 * Benefits:
 * - Simplifies object creation
 * - Avoids Subclassing
 * - Supports Shallow or deep copying
 * - Efficient Creation
 * - Consistency
 */
public class Main {
    public static void main(String[] args) {
        GameBoard gameBoard = new GameBoard();
        gameBoard.addPiece(new GamePiece("Red", 1));
        gameBoard.addPiece(new GamePiece("Blue", 5));
        gameBoard.showBoardState();

        GameBoard copy = gameBoard.clone();

        System.out.println("Copied Board");
        copy.showBoardState();
    }
}
