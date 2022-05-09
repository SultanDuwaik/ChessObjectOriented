package com.company;

public class Bishop extends Piece{

    public Bishop(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean isMoveLegal(Board board, Move move) {
        return true;
    }

    @Override
    public String toString() {
        return isWhite()? "♝":"♗";
    }
}
