package com.company;

public class Rook extends Piece{

    public Rook(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean isMoveLegal(Board board, Move move) {
        return true;
    }

    @Override
    public String toString() {
        return isWhite()?"♜":"♖";
    }
}
