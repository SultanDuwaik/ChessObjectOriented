package com.company;

public class PieceFactory {

    public static Piece createPiece(String piece){

        if(piece.equalsIgnoreCase("black pawn")){
            return new Pawn(false);
        }
        else if(piece.equalsIgnoreCase("white pawn")){
            return new Pawn(true);
        }

        else if(piece.equalsIgnoreCase("black rook")){
            return new Rook(false);
        }
        else if(piece.equalsIgnoreCase("white rook")){
            return new Rook(true);
        }

        else if(piece.equalsIgnoreCase("black knight")){
            return new Knight(false);
        }
        else if(piece.equalsIgnoreCase("white knight")){
            return new Knight(true);
        }

        else if(piece.equalsIgnoreCase("black bishop")){
            return new Bishop(false);
        }
        else if(piece.equalsIgnoreCase("white bishop")){
            return new Bishop(true);
        }

        else if(piece.equalsIgnoreCase("black Queen")){
            return new Queen(false);
        }
        else if(piece.equalsIgnoreCase("white Queen")){
            return new Queen(true);
        }

        else if(piece.equalsIgnoreCase("black King")){
            return new King(false);
        }
        else if(piece.equalsIgnoreCase("white King")){
            return new King(true);
        }
        else return null;
    }

}
