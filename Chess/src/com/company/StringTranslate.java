package com.company;

public class StringTranslate {

    private static final int STRING_MAX_LENGTH = 3;

    private StringTranslate(){}

    public static Move getMove(String move, Board board){
 // move A1 A2
        String[] moveString = move.split(" ");

        int fromX = Math.abs(moveString[1].charAt(1) - '8');
        int toX   = Math.abs(moveString[2].charAt(1) - '8');
        int fromY = moveString[1].charAt(0) - 65;
        int toY   = moveString[2].charAt(0) - 65;

        if(moveString.length != STRING_MAX_LENGTH) return null;

        Spot from =  board.getSpot(fromX, fromY);
        Spot to   =  board.getSpot(toX, toY);

        return new Move(from, to);
    }

}
