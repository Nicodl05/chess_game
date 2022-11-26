package Auxiliary;

import Pieces.*;

import java.util.ArrayList;
import java.util.List;

public class Board {
    Spot[][] board = new Spot[8][8];

    public Spot[][] getBoard() {
        return board;
    }

    public void setBoard(Spot[][] board) {
        this.board = board;
    }

    public Board() {
        this.resetBoard();
    }

    public Spot getSpot(int x, int y) throws Exception {
        if (x < 0 || x > 7 || y < 0 || y > 7) {
            throw new Exception("Index out of bound");
        }
        return board[x][y];
    }

    public void resetBoard() {
        ///White Pieces

        // Initialise OTHER WHITE PIECES
        board[7][0] = new Spot(7, 0, 'a', '1', new Rook( true, false));
        board[7][1] = new Spot(7, 1, 'b', '1', new Knight( true, false));
        board[7][2] = new Spot(7, 2, 'c', '1', new Bishop( true, false));
        board[7][3] = new Spot(7, 3, 'd', '1', new Queen( true, false));
        board[7][4] = new Spot(7, 4, 'e', '1', new King( true, false));
        board[7][5] = new Spot(7, 5, 'f', '1', new Bishop( true, false));
        board[7][6] = new Spot(7, 6, 'g', '1', new Knight( true, false));
        board[7][7] = new Spot(7, 7, 'h', '1', new Rook( true, false));

        // initialize WHITE PAWN pieces
        board[6][0]=new Spot(6, 0, 'a', '2', new Pawn( true, false));
        board[6][1]=new Spot(6, 1, 'b', '2', new Pawn( true, false));
        board[6][2]=new Spot(6, 2, 'c', '2', new Pawn( true, false));
        board[6][3]=new Spot(6, 3, 'd', '2', new Pawn( true, false));
        board[6][4]=new Spot(6, 4, 'e', '2', new Pawn( true, false));
        board[6][5]=new Spot(6, 5, 'f', '2', new Pawn( true, false));
        board[6][6]=new Spot(6, 6, 'g', '2', new Pawn( true, false));
        board[6][7]=new Spot(6, 7, 'h', '2', new Pawn( true, false));



        ///Black pieces
        // initialize BLACK PAWN pieces
        board[1][0]=new Spot(1, 0, 'a', '7', new Pawn(false, false));
        board[1][1]=new Spot(1, 1, 'b', '7', new Pawn(false, false));
        board[1][2]=new Spot(1, 2, 'c', '7', new Pawn(false, false));
        board[1][3]=new Spot(1, 3, 'd', '7', new Pawn(false, false));
        board[1][4]=new Spot(1, 4, 'e', '7', new Pawn(false, false));
        board[1][5]=new Spot(1, 5, 'f', '7', new Pawn(false, false));
        board[1][6]=new Spot(1, 6, 'g', '7', new Pawn(false, false));
        board[1][7]=new Spot(1, 7, 'h', '7', new Pawn(false, false));

        // initialize other black pieces
        board[0][0] = new Spot(0, 0, 'a', '8', new Rook(false, false));
        board[0][1] = new Spot(0, 1, 'b', '8', new Knight(false, false));
        board[0][2] = new Spot(0, 2, 'c', '8', new Bishop(false, false));
        board[0][3] = new Spot(0, 3, 'd', '8', new Queen(false, false));
        board[0][4] = new Spot(0, 4, 'e', '8', new King(false, false));
        board[0][5] = new Spot(0, 5, 'f', '8', new Bishop(false, false));
        board[0][6] = new Spot(0, 6, 'g', '8', new Knight(false, false));
        board[0][7] = new Spot(0, 7, 'h', '8', new Rook(false, false));


        // initialize remaining board without any piece
        board[2][0] = new Spot(2, 0, 'a', '6', null);
        board[2][1] = new Spot(2, 1, 'b', '6', null);
        board[2][2] = new Spot(2, 2, 'c', '6', null);
        board[2][3] = new Spot(2, 3, 'd', '6', null);
        board[2][4] = new Spot(2, 4, 'e', '6', null);
        board[2][5] = new Spot(2, 5, 'f', '6', null);
        board[2][6] = new Spot(2, 6, 'g', '6', null);
        board[2][7] = new Spot(2, 7, 'h', '6', null);

        board[3][0] = new Spot(3, 0, 'a', '5', null);
        board[3][1] = new Spot(3, 1, 'b', '5', null);
        board[3][2] = new Spot(3, 2, 'c', '5', null);
        board[3][3] = new Spot(3, 3, 'd', '5', null);
        board[3][4] = new Spot(3, 4, 'e', '5', null);
        board[3][5] = new Spot(3, 5, 'f', '5', null);
        board[3][6] = new Spot(3, 6, 'g', '5', null);
        board[3][7] = new Spot(3, 7, 'h', '5', null);

        board[4][0] = new Spot(4, 0, 'a', '4', null);
        board[4][1] = new Spot(4, 1, 'b', '4', null);
        board[4][2] = new Spot(4, 2, 'c', '4', null);
        board[4][3] = new Spot(4, 3, 'd', '4', null);
        board[4][4] = new Spot(4, 4, 'e', '4', null);
        board[4][5] = new Spot(4, 5, 'f', '4', null);
        board[4][6] = new Spot(4, 6, 'g', '4', null);
        board[4][7] = new Spot(4, 7, 'h', '4', null);

        board[5][0] = new Spot(5, 0, 'a', '3', null);
        board[5][1] = new Spot(5, 1, 'b', '3', null);
        board[5][2] = new Spot(5, 2, 'c', '3', null);
        board[5][3] = new Spot(5, 3, 'd', '3', null);
        board[5][4] = new Spot(5, 4, 'e', '3', null);
        board[5][5] = new Spot(5, 5, 'f', '3', null);
        board[5][6] = new Spot(5, 6, 'g', '3', null);
        board[5][7] = new Spot(5, 7, 'h', '3', null);


        board[3][4] = new Spot(3, 4, 'e', '5', new Queen( true, false));
        board[1][4] = new Spot(1, 4, 'e', '7', null);
        board[6][4] = new Spot(6, 4, 'e', '2', null);
        board[3][3] = new Spot(3, 3, 'd', '5', new Queen( false, false));

    }


    public void displayBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j].DisplaySpot();
            }
            System.out.println();
        }
    }


    //ALL METHOD THAT WE TRANSEFERED
    /*
    //This method do the move and capture if necessary
    public void Move(Spot start, Spot end, Player player) throws Exception {

        Checkmate(player.getColor());
        for (int i=0; i<8; i++){
            for (int j=0; j<8; j++){
                //In new Spot
                if (board[i][j]==end){
                    //If exists, delete old piece from spot;
                    if (board[i][j].getPiece()!=null){
                        board[i][j].setPiece(null);
                    }
                    //Set new piece
                    board[i][j].setPiece(start.getPiece());
                    //set hasMoved to true
                    board[i][j].getPiece().setHasmoved(true);
                }
            }
        }

        for (int i=0; i<8; i++){
            for (int j=0; j<8;j++){
                //In old spot, delete the piece
                if (board[i][j]==start){
                    board[i][j].setPiece(null);
                }
            }
        }

        if (Check_King(player.getColor())==true){
            System.out.println("The king of player who just did the move "+player.getName()+" with "+player.getColor()+ " is in check\n");
        }
        else{
            System.out.println("The king of player who just did the move "+player.getName()+" with "+player.getColor()+ " is NOT in check\n");
        }

        //AFTER OUR MOVE, we check how many move the king still has
        //We will combine this method and Check to see if it is a checkmate
        //We must also check if it is possible to eat the piece which did the checkmate...
        //To do that, we can try ALL of our available move and see if in the next turn I m still in Check
        Real_available_Move_King(player.getColor());
    }

    //Method that returns All attacked spot by the opponent (it returns N times the same spot if this spot is attacked N times)
    public List<Spot> attacked_spot(boolean color_player) throws Exception {
        List<Spot> attacked_spot=new ArrayList<>();
        List<Spot> availables=new ArrayList<>();

        //On all board
        for (int i=0; i<8; i++){
            for (int j=0; j<8; j++){

                //if the spot on board isn't empty And it is an ennemy
                if (board[i][j].getPiece()!=null &&
                        board[i][j].getPiece().getColor()!=color_player){

                    //if it is a Pawn
                    if (board[i][j].getPiece().getType()=="Pawn"){
                        //On white side:
                        if (color_player==true){
                            if (i<7 && j>0) {
                                attacked_spot.add(board[i+1][j-1]);
                            }
                            if (i<7 && j<7) {
                                attacked_spot.add(board[i+1][j+1]);
                            }
                        }

                        //On black side:
                        if (color_player==false){
                            if (i>0 && j<7) {
                                attacked_spot.add(board[i-1][j+1]);
                            }
                            if (i>0 && j>0) {
                                attacked_spot.add(board[i-1][j-1]);
                            }
                        }
                    }

                    //if it is a King
                    if (board[i][j].getPiece().getType()=="King"){
                        int x=board[i][j].getX();
                        int y=board[i][j].getY();

                        //On the left of King
                        if (y<7) {
                            if (board[x][y+1].getPiece() == null
                                    || board[x][y+1].getPiece().getColor() != board[i][j].getPiece().getColor()) {
                                attacked_spot.add(board[x][y+1]);
                            }
                        }

                        //On the right of King
                        if (y>0) {
                            if (board[x][y-1].getPiece() == null
                                    || board[x][y-1].getPiece().getColor() != board[i][j].getPiece().getColor()) {
                                attacked_spot.add(board[x][y-1]);
                            }
                        }

                        //Below the King
                        if (x<7) {
                            if (board[x+1][y].getPiece() == null
                                    || board[x+1][y].getPiece().getColor() != board[i][j].getPiece().getColor()) {
                                attacked_spot.add(board[x+1][y]);
                            }
                        }

                        //Above the King
                        if (x>0) {
                            if (board[x-1][y].getPiece() == null
                                    || board[x-1][y].getPiece().getColor() != board[i][j].getPiece().getColor()) {
                                attacked_spot.add(board[x-1][y]);
                            }
                        }

                        //Above Right King
                        if (x>0 && y<7){
                            if (board[x-1][y+1].getPiece() == null
                                    || board[x-1][y+1].getPiece().getColor() != board[i][j].getPiece().getColor()) {
                                attacked_spot.add(board[x-1][y+1]);}
                        }

                        //Above Left King
                        if (x>0 && y>0){
                            if (board[x-1][y-1].getPiece() == null
                                    || board[x-1][y-1].getPiece().getColor() != board[i][j].getPiece().getColor()) {
                                attacked_spot.add(board[x-1][y-1]);}

                        }

                        //Below Left King
                        if (x<7 && y>0){
                            if (board[x+1][y-1].getPiece() == null
                                    || board[x+1][y-1].getPiece().getColor() != board[i][j].getPiece().getColor()) {
                                attacked_spot.add(board[x+1][y-1]);
                            }
                        }

                        //Below Right King
                        if (x<7 && y<7){
                            if (board[x+1][y+1].getPiece() == null
                                    || board[x+1][y+1].getPiece().getColor() != board[i][j].getPiece().getColor()) {
                                attacked_spot.add(board[x+1][y+1]);
                            }
                        }
                    }

                    //If it is anything else than a PAWN
                    else{
                        //Check all of the move of the ennemy piece
                        availables = board[i][j].getPiece().available_spot(board, board[i][j]);

                        //Increment all available moves of ennemy in attacked_spot
                        if (availables.size()!=0) {
                            for (int k = 0; k<availables.size(); k++) {
                                attacked_spot.add(availables.get(k));
                            }
                        }

                    }
                }
            }
        }


        return attacked_spot;
    }

    public boolean Check_King(boolean color_player) throws Exception {
        List<Spot> unvalid_spots=attacked_spot(color_player);
        for (int i=0; i<8; i++){
            for (int j=0; j<8; j++){
                    //We find my king spot
                if (board[i][j].getPiece()!=null) {
                    if (board[i][j].getPiece().getColor() == color_player
                            && board[i][j].getPiece().getType() == "King") {

                        //In all unvalid spot
                        for (int k = 0; k < unvalid_spots.size(); k++) {
                            //If one of them is the spot of my king, it is a check
                            if (unvalid_spots.get(k) == board[i][j]) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public List<Spot> Real_available_Move_King(boolean color_player) throws Exception {
        List <Spot> attacked=attacked_spot(color_player);
        List <Spot> availables = new ArrayList<>();

        //This first loop is to find all availables moves of King
        for (int i=0; i<8; i++){
            for (int j=0; j<8; j++){
                //We find my king spot
                if (board[i][j].getPiece()!=null) {
                    if (board[i][j].getPiece().getColor() == color_player
                            && board[i][j].getPiece().getType() == "King") {
                        //Check all of the available moves of the king (without considering the attacked_spot)
                        availables = board[i][j].getPiece().available_spot(board, board[i][j]);
                    }
                }
            }
        }

        //This second loop is to remove all attacked_spots from available moves

        if (availables.size()!=0 && attacked.size()!=0){
            for (int i=0; i<attacked.size(); i++){
                for (int j=0; j<availables.size(); j++){
                    if (attacked.get(i)==availables.get(j)){
                        availables.remove(j);
                    }
                }
            }
        }

        System.out.println("Number of movement of attacked King: "+availables.size());
        for (int i=0; i<availables.size(); i++){
            availables.get(i).DisplayCoordinate();
        }


        return availables;
    }

    public boolean Checkmate(boolean color_player) throws Exception {
        List <Spot> availables=new ArrayList<>();
        //If the king is in check AND has no move
        if (Check_King(color_player)==true && Real_available_Move_King(color_player).size()==0){

            //WHAT WE WANT: Try all of available move with other pieces and see if he is still in check

            for (int i=0; i<8; i++){
                for (int j=0; j<8; j++){
                    //If it is one of our piece
                    if (board[i][j].getPiece()!=null) {
                        if (board[i][j].getPiece().getColor() == color_player) {
                            //All of my available moves in the board
                            availables.addAll(board[i][j].getPiece().available_spot(board, board[i][j]));


                        }
                    }
                }
            }
            System.out.println("In checkmate, all available moves to try from other pieces: "+availables.size());
            for (int i=0; i<availables.size(); i++){
                availables.get(i).DisplayCoordinate();
            }
        }

        return false;
    }*/


    public Spot[][] copyboard(){
        Spot [][] copboard = new Spot[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                copboard[i][j]= new Spot(board[i][j]);
            }
        }
        return copboard;
    }


}
