package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ChessGame chessGame = new ChessGame("saif", "ahmad");
        while(!chessGame.isDone()){
            String move = br.readLine();
            if(chessGame.isWhiteTurn()) chessGame.playWhite(move);
            else chessGame.playBlack(move);
        }
        chessGame.printWinnerName();

    }
}
