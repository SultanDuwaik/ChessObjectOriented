package com.company;

public class Spot {
    private int x;
    private int y;
    private Piece piece;

    public Spot(Piece piece, int x, int y){
        this.piece = piece;
        this.x = x;
        this.y = y;
    }

    public Piece getPiece(){
        return piece;
    }

    public Piece removePiece() {
        Piece temp = piece;
        this.piece = null;
        return temp;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setPiece(Piece piece){
        this.piece = piece;
    }

    @Override
    public String toString() {
        return "Spot{" +
                "x=" + x +
                ", y=" + y +
                ", piece=" + piece +
                '}';
    }
}
