package com.haleluque.low.level.design.design.patterns.CreationalPatterns.PrototypePattern.exampleWithout;

import java.util.ArrayList;
import java.util.List;

public class GameBoardW {
    private final List<GamePieceW> pieces = new ArrayList<>();

    public void addPiece(GamePieceW piece) {
        pieces.add(piece);
    }

    public List<GamePieceW> getPieces() {
        return pieces;
    }

    public void showBoardState() {
        System.out.println("Current Board State");
        pieces.forEach(System.out::println);
    }
}