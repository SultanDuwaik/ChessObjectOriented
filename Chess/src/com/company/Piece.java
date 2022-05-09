package com.company;

public abstract class Piece {

    private final boolean isWhite;

    public Piece(boolean isWhite){
        this.isWhite = isWhite;
    }

    public boolean isWhite(){
        return isWhite;
    }

    public abstract boolean isMoveLegal(Board board, Move move);
}
