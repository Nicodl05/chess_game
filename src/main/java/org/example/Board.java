package org.example;

public class Board {
    Spot[][] board=new Spot[8][8];

    public Board()
    {
        this.resetBoard();
    }

    public Spot getBox(int x, int y) throws Exception {

        if (x < 0 || x > 7 || y < 0 || y > 7) {
            throw new Exception("Index out of bound");
        }

        return board[x][y];
    }

    public void resetBoard()
    {
        ///White Pieces
        // initialize White pieces
        for (int i=0; i<8; i++) {
            for ( char alphabet = 'a'; alphabet <= 'z'; alphabet++) {
                board[i][0] = new Spot(i, 0, alphabet,i+1, new Rook(true, true));
            }
        }

        board[0][0] = new Spot(0, 0, "A","1", new Rook(true, true));
        board[1][0] = new Spot(1, 0, "B", "1",new Knight(true, true));
        board[2][0] = new Spot(2, 0, "C","1", new Bishop(true, true));
        board[3][0] = new Spot(3, 0, "D", "1",new Queen(true, true));
        board[4][0] = new Spot(4, 0, "E","1", new King(true, true));
        board[5][0] = new Spot(5, 0, "F", "1",new Bishop(true, true));
        board[6][0] = new Spot(6, 0, "G","1", new Knight(true, true));
        board[7][0] = new Spot(7, 0, "H", "1",new Rook(true, true));

        //Initialise White Pawns
        board[0][1] = new Spot(0, 1, "A","2", new Pawn(true, true));
        board[1][1] = new Spot(1, 1, "B", "2",new Pawn(true, true));
        board[2][1] = new Spot(2, 1, "C","2", new Pawn(true, true));
        board[3][1] = new Spot(3, 1, "D", "2",new Pawn(true, true));
        board[4][1] = new Spot(4, 1, "E","2", new Pawn(true, true));
        board[5][1] = new Spot(5, 1, "F", "2",new Pawn(true, true));
        board[6][1] = new Spot(6, 1, "G","2", new Pawn(true, true));
        board[7][1] = new Spot(7, 1, "H", "2",new Pawn(true, true));


        ///Black pieces

        //initialise black Pawn

        board[0][6] = new Spot(0, 6, "A","8", new Pawn(true, false));
        board[1][6] = new Spot(1, 6, "B", "8",new Pawn(true, false));
        board[2][6] = new Spot(2, 6, "C","8", new Pawn(true, false));
        board[3][6] = new Spot(3, 6, "D", "8",new Pawn(true, false));
        board[4][6] = new Spot(4, 6, "E","8", new Pawn(true, false));
        board[5][6] = new Spot(5, 6, "F", "8",new Pawn(true, false));
        board[6][6] = new Spot(6, 6, "G","8", new Pawn(true, false));
        board[7][6] = new Spot(7, 6, "H", "8",new Pawn(true, false));

        // initialize other black pieces
        board[0][7] = new Spot(0, 7, "A","8", new Rook(true, false));
        board[1][7] = new Spot(1, 7, "B", "8",new Knight(true, false));
        board[2][7] = new Spot(2, 7, "C","8", new Bishop(true, false));
        board[3][7] = new Spot(3, 7, "D", "8",new Queen(true, false));
        board[4][7] = new Spot(4, 7, "E","8", new King(true, false));
        board[5][7] = new Spot(5, 7, "F", "8",new Bishop(true, false));
        board[6][7] = new Spot(6, 7, "G","8", new Knight(true, false));
        board[7][7] = new Spot(7, 7, "H", "8",new Rook(true, false));

        //...

        // initialize remaining board without any piece
        for (int i = 0; i < 8; i++) {
            for (int j = 2; j < 6; j++) {

                board[i][j] = new Spot(i, j, null);
            }
        }
    }
}
