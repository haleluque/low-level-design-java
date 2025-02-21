package com.haleluque.low.level.design.design.patterns.CreationalPatterns.PrototypePattern.example;

import java.util.ArrayList;
import java.util.List;

public class GameBoard implements Prototype<GameBoard> {
    private final List<GamePiece> pieces = new ArrayList<>();

    public void addPiece(GamePiece piece) {
        pieces.add(piece);
    }

    public List<GamePiece> getPieces() {
        return pieces;
    }

    public void showBoardState() {
        System.out.println("Current Board State");
        pieces.forEach(System.out::println);
    }

    @Override
    public GameBoard clone() {
        //Deep copy
        GameBoard gameBoard = new GameBoard();
        pieces.stream().map(GamePiece::clone).forEach(gameBoard::addPiece);
        return gameBoard;
    }
}
