package com.company;

public class PlacePiece {

    private PlacePiece(){}

    public static Spot WhiteKing(int x, int y) {
        return new Spot(PieceFactory.createPiece("white king"), x, y);
    }

    public static Spot WhiteQueen(int x, int y) {
        return new Spot(PieceFactory.createPiece("white queen"), x, y);
    }

    public static Spot WhiteKnight(int x, int y) {
        return new Spot(PieceFactory.createPiece("white knight"), x, y);
    }

    public static Spot WhiteBishop(int x, int y) {
        return new Spot(PieceFactory.createPiece("white bishop"), x, y);
    }

    public static Spot WhiteRook(int x, int y) {
        return new Spot(PieceFactory.createPiece("white rook"), x, y);
    }

    public static Spot WhitePawn(int x, int y) {
        return new Spot(PieceFactory.createPiece("white pawn"), x, y);
    }

    public static Spot BlackKing(int x, int y) {
        return new Spot(PieceFactory.createPiece("black king"), x, y);
    }

    public static Spot BlackQueen(int x, int y) { return new Spot(PieceFactory.createPiece("black queen"), x, y); }

    public static Spot BlackKnight(int x, int y) {
        return new Spot(PieceFactory.createPiece("black knight"), x, y);
    }

    public static Spot BlackBishop(int x, int y) {
        return new Spot(PieceFactory.createPiece("black bishop"), x, y);
    }

    public static Spot BlackRook(int x, int y) {
        return new Spot(PieceFactory.createPiece("black rook"), x, y);
    }

    public static Spot BlackPawn(int x, int y) {
        return new Spot(PieceFactory.createPiece("black pawn"), x, y);
    }

    public static Spot EmptySpot(int x, int y){
        return new Spot(null, x, y);
    }

}
