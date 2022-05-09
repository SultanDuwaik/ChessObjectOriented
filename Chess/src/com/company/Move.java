package com.company;

public class Move {

    private Spot start, dist;
    Piece pieceMoved, pieceKilled;

    public Move(Spot from, Spot to){
        this.start = from;
        this.dist = to;
        pieceMoved = start.getPiece();
        pieceKilled = dist.getPiece();
    }

    public Piece getPieceKilled() {return pieceKilled;}

    public Piece getPieceMoved() { return pieceMoved; }

    public Spot getStartingSpot() { return start; }

    public Spot getDistSpot() { return dist; }

    public boolean isOutOfBoundaries(){
        return start.getY() < 0 || dist.getY() < 0 || start.getX() > 7 || start.getY() > 7 || dist.getX() > 7 || dist.getY() > 7;
    }

    public boolean isCastlingMove(Board board) {
        // algorithm
        King king = (King) start.getPiece();
        if(king.getCastleMoveDone()) return false;
        king.setCastleMoveDone();
        return true;
    }

    public boolean canPromote() {
        return dist.getX() == 0 && pieceMoved.isWhite()  || dist.getX() == 7 && !pieceMoved.isWhite();
    }

}
