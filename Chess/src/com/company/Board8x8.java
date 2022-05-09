package com.company;

public class Board8x8 implements Board{

    private static final int SIZE = 8;
    private final Spot[][] board ;

    public Board8x8(){
        board = new Spot[SIZE][SIZE];
        setBoard();
    }

    public Spot getSpot(int x, int y) {
        return board[x][y];
    }

    public void setBoard(){
        for(int i = 0 ; i < SIZE; i++) {
            board[1][i] = new Spot(PieceFactory.createPiece("black pawn"),1, i);
            board[6][i] = new Spot(PieceFactory.createPiece("white pawn"),6, i);
        }

        for(int i = 2; i < 6; i++)
            for (int j = 0; j < SIZE; j++)
                board[i][j] = new Spot(null, i, j);

        board[0][0] = new Spot(PieceFactory.createPiece("black rook"),0,0);
        board[0][7] = new Spot(PieceFactory.createPiece("black rook"),0,7);
        board[7][0] = new Spot(PieceFactory.createPiece("white rook"),7,0);
        board[7][7] = new Spot(PieceFactory.createPiece("white rook"),7,7);

        board[0][1] = new Spot(PieceFactory.createPiece("black knight"),0,1);
        board[0][6] = new Spot(PieceFactory.createPiece("black knight"),0,6);
        board[7][1] = new Spot(PieceFactory.createPiece("white knight"),7,1);
        board[7][6] = new Spot(PieceFactory.createPiece("white knight"),7,6);

        board[0][2] = new Spot(PieceFactory.createPiece("black bishop"),0,2);
        board[0][5] = new Spot(PieceFactory.createPiece("black bishop"),0,5);
        board[7][2] = new Spot(PieceFactory.createPiece("white bishop"),7,2);
        board[7][5] = new Spot(PieceFactory.createPiece("white bishop"),7,5);

        board[0][3] = new Spot(PieceFactory.createPiece("black queen"),0,3);
        board[7][3] = new Spot(PieceFactory.createPiece("white queen"),7,3);

        board[0][4] = new Spot(PieceFactory.createPiece("black king"),0,4);
        board[7][4] = new Spot(PieceFactory.createPiece("white king"),7,4);

    }

    public void promotePawn(Move move){
        Spot pawn = move.getDistSpot();
        if(pawn.getPiece().isWhite())
            board[pawn.getX()][pawn.getY()] =new Spot(PieceFactory.createPiece("white queen"),pawn.getX(), pawn.getY());
        else
            board[pawn.getX()][pawn.getY()] =new Spot(PieceFactory.createPiece("black queen"),pawn.getX(), pawn.getY());
    }

    public void displayBoard(){
        System.out.println("┏━━━━━━━┯━━━━━━━┳━━━━━━━┳━━━━━━━┳━━━━━━━┳━━━━━━━┳━━━━━━━┳━━━━━━━┓");
        for (int i = 0 ; i < SIZE ; i++) {
            System.out.print("│");
            for (int j = 0; j < SIZE; j++) {
                if(board[i][j].getPiece() == null)
                    System.out.print("\t \t┃");
                else
                    System.out.print("\t"+board[i][j].getPiece()+"\t┃");
            }
            System.out.println(i != 7 ? "\n┣━━━━━━━╋━━━━━━━╋━━━━━━━╋━━━━━━━╋━━━━━━━╋━━━━━━━╋━━━━━━━╋━━━━━━━┫":"");

        }
        System.out.println("┗━━━━━━━┻━━━━━━━┻━━━━━━━┻━━━━━━━┻━━━━━━━┻━━━━━━━┻━━━━━━━┻━━━━━━━┛");
    }
}
