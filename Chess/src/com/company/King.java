package com.company;

public class King extends Piece{

    private boolean castleMoveDone;

    public King(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean isMoveLegal(Board board, Move move) {
        return true;
    }

    public void setCastleMoveDone(){
        this.castleMoveDone = true;
    }

    public boolean getCastleMoveDone(){
        return castleMoveDone;
    }

    @Override
    public String toString() {
        return isWhite() ? "♚":"♔";
    }

}
