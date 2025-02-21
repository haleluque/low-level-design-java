package com.haleluque.low.level.design.design.patterns.CreationalPatterns.PrototypePattern.exampleWithout;

public class MainW {
    public static void main(String[] args) {
        GameBoardW gameBoard = new GameBoardW();
        gameBoard.addPiece(new GamePieceW("Red", 1));
        gameBoard.addPiece(new GamePieceW("Blue", 5));
        gameBoard.showBoardState();

        //Checkpoint this state
        GameBoardW copiedBoard = new GameBoardW();
        for (GamePieceW piece : gameBoard.getPieces()) {
            copiedBoard.addPiece(new GamePieceW(piece.getColor(), piece.getPosition()));
        }

        System.out.println("Copied Board");
        copiedBoard.showBoardState();
    }
}
