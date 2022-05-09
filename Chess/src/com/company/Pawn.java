package com.company;

public class Pawn extends Piece{

    public Pawn(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean isMoveLegal(Board board, Move move) {
        return true;
    }

    @Override
    public String toString() {
        return isWhite()?"♟":"♙";
    }

}
