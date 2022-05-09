package com.company;

public class Queen extends Piece {

    public Queen(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean isMoveLegal(Board board, Move move) {
        return true;
    }


    @Override
    public String toString() {
        return isWhite() ?"♛" :"♕";
    }
}
