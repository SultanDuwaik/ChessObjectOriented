package com.company;

public class Knight extends Piece{

     public Knight(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean isMoveLegal(Board board, Move move) {
        return true;
    }

    @Override
    public String toString() {
        return isWhite()?"♞":"♘";
    }
}
