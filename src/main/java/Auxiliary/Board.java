package Auxiliary;

import Pieces.*;
//We are coding with Black in front of us

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

        // Initialise OTHER WHITE PIECES
        board[7][0] = new Spot(7, 0, 'a','1', new Rook(true, true));
        board[7][1] = new Spot(7, 1, 'b', '1',new Knight(true, true));
        board[7][2] = new Spot(7, 2, 'c','1', new Bishop(true, true));
        board[7][3] = new Spot(7, 3, 'd', '1',new Queen(true, true));
        board[7][4] = new Spot(7, 4, 'e','1', new King(true, true));
        board[7][5] = new Spot(7, 5, 'f', '1',new Bishop(true, true));
        board[7][6] = new Spot(7, 6, 'g','1', new Knight(true, true));
        board[7][7] = new Spot(7, 7, 'h', '1',new Rook(true, true));

        // initialize WHITE PAWN pieces
        for (int i=0; i<8; i++) {
            for ( char alphabet = 'a'; alphabet <= 'h'; alphabet++) {
                board[6][i] = new Spot(6, i, alphabet,'2', new Pawn(true, true));
            }
        }


        ///Black pieces
        // initialize BLACK PAWN pieces
        for (int i=0; i<8; i++) {
            for ( char alphabet = 'a'; alphabet <= 'h'; alphabet++) {
                board[1][i] = new Spot(1, i, alphabet,'7', new Pawn(true, false));
            }
        }

        // initialize other black pieces
        board[0][0] = new Spot(0, 0, 'a','8', new Rook(true, false));
        board[0][1] = new Spot(0, 1, 'b', '8',new Knight(true, false));
        board[0][2] = new Spot(0, 2, 'c','8', new Bishop(true, false));
        board[0][3] = new Spot(0, 3, 'd', '8',new Queen(true, false));
        board[0][4] = new Spot(0, 4, 'e','8', new King(true, false));
        board[0][5] = new Spot(0, 5, 'f', '8',new Bishop(true, false));
        board[0][6] = new Spot(0, 6, 'g','8', new Knight(true, false));
        board[0][7] = new Spot(0, 7, 'h', '8',new Rook(true, false));


        // initialize remaining board without any piece
        for (int i = 2; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                for (char alphabet = 'a'; alphabet <= 'h'; alphabet++) {
                    char temp='t';
                    if (i==2)
                        temp='6';
                    if (i==3)
                        temp='5';
                    if (i==4)
                        temp='4';
                    if (i==5)
                        temp='3';

                    board[i][j] = new Spot(i, j, alphabet,temp ,null);
                }
            }
        }
    }

    public void displayBoard(){
        for (int i=0; i<8; i++){
            for (int j=0;j<8; j++){
                board[i][j].DisplaySpot();
            }
            System.out.println();
        }
    }
}
