package com.company;

public class ChessGame implements Game, TwoPlayer {

    private final Board8x8 board ;
    private GameStatus status;
    private final HumanPlayer whitePlayer;
    private final HumanPlayer blackPlayer;
    private boolean  isWhiteTurn;

    public ChessGame(String whiteName, String blackName){

        whitePlayer = new HumanPlayer(whiteName, true);
        blackPlayer = new HumanPlayer(blackName, false);
        board = new Board8x8();
        isWhiteTurn = true;
        status = GameStatus.ACTIVE;
        board.displayBoard();
        System.out.println("white start: ");
    }

    public boolean isDone(){
        return  getStatus() != GameStatus.ACTIVE;
    }

    public boolean isWhiteTurn(){
        return isWhiteTurn;
    }

    public void playWhite(String move){
        isWhiteTurn = !makePlay(move);
        board.displayBoard();
        System.out.println(!isWhiteTurn ? "black turn: " : "illegal move! try again.");
    }

    public void playBlack(String move){
        isWhiteTurn = makePlay(move);
        board.displayBoard();
        System.out.println(isWhiteTurn ? "white turn: " : "illegal move! try again.");
    }

    private boolean makePlay(String moveString){

        Move move = StringTranslate.getMove(moveString, board);

        if(move == null) return false;

        Piece pieceMoved = move.getPieceMoved();

        if(pieceMoved == null) return false;

        if(move.isOutOfBoundaries()) return false;

        if(pieceMoved.isWhite() != isWhiteTurn()) return false;

        if(!pieceMoved.isMoveLegal(board, move)) return false;

        if(move.getPieceKilled() != null && move.getPieceKilled() instanceof King)
            status = isWhiteTurn ? GameStatus.WHITE_WIN : GameStatus.BLACK_WIN;

        else if(pieceMoved instanceof King && move.isCastlingMove(board)) {
            performCastlingMove(move);
        }
        else performMove(move);

        if(pieceMoved instanceof Pawn && move.canPromote()) performPromotion(move);

        return true;
    }

    public void printWinnerName(){
        System.out.println(getStatus() == GameStatus.WHITE_WIN ? whitePlayer.getName() + " Won!" : blackPlayer.getName() + " Won!");
    }

    public GameStatus getStatus(){
        return status;
    }

    private void performCastlingMove(Move move){
        // stubbed-out
    }

    private void performMove(Move move){
        move.getDistSpot().setPiece(move.getStartingSpot().removePiece());
    }

    private void performPromotion(Move move){
        board.promotePawn(move);
    }
}