package Pieces;

import Auxiliary.Board;
import Auxiliary.Spot;

import java.util.ArrayList;
import java.util.List;

public class Queen extends Piece{
    public Queen( boolean color, boolean hasmoved) {
        super(color, 9, hasmoved);
    }

    @Override
    public List<Spot> available_spot(Board board, Spot start) throws Exception {
        List<Spot> availables = new ArrayList<>();
        int x=start.getX();
        int y=start.getY();
        boolean limit=false;

        //ROOK PROPERTIES
        //The list of all available spot in the column (check up)
        //Also, we check if we aren't in top line
        while (limit==false && x>0) {
            for (int i = x - 1; i >= 0; i--) {
                if (limit == false) {
                    //check if the spot is empty
                    if (board.getSpot(i, y).getPiece() == null) {
                        availables.add(board.getSpot(i, y));
                        //If we reached the limit of the board in top, we end this check
                        if (i==0){
                            limit=true;
                        }
                    } else {
                        //Check if it is an ally
                        if (start.getPiece().getColor() == board.getSpot(i, y).getPiece().getColor()) {
                        } else {
                            availables.add(board.getSpot(i, y));
                        }
                        limit = true;
                    }
                }
            }
        }
        limit=false;

        //The list of all available spot in the column (check down)
        //Also, we check if we aren't in bottom line
        while (limit==false && x<7) {
            for (int i = x + 1; i <8; i++) {
                if (limit == false) {
                    //check if the spot is empty
                    if (board.getSpot(i, y).getPiece() == null) {
                        availables.add(board.getSpot(i, y));
                        //If we reached the limit of the board in down, we end this check
                        if (i==7){
                            limit=true;
                        }
                    } else {
                        //Check if it is an ally
                        if (start.getPiece().getColor() == board.getSpot(i, y).getPiece().getColor()) {
                        } else {
                            availables.add(board.getSpot(i, y));
                        }
                        limit = true;
                    }
                }
            }
        }
        limit=false;


        //The list of all available spot in the line (check left)
        //Also, we check if we aren't in left column
        while (limit==false && y>0) {
            for (int i = y-1; i >=0; i--) {
                if (limit == false) {
                    //check if the spot has no pieces
                    if (board.getSpot(x, i).getPiece() == null) {
                        availables.add(board.getSpot(x, i));
                        //If we reached the limit of the board in left, we end this check
                        if (i==0){
                            limit=true;
                        }
                    } else {
                        //Check if it is an ally
                        if (start.getPiece().getColor() == board.getSpot(x, i).getPiece().getColor()) {
                        } else {
                            availables.add(board.getSpot(x, i));
                        }
                        limit = true;
                    }
                }
            }
        }
        limit=false;

        //The list of all available spot in the line (check right)
        //Also, we check if we aren't in right column
        while (limit==false && y<7) {
            for (int i = y+1; i <8; i++) {
                if (limit == false) {
                    //check if the spot is empty
                    if (board.getSpot(x, i).getPiece() == null) {
                        availables.add(board.getSpot(x, i));
                        //If we reached the limit of the board in right, we end this check
                        if (i==7){
                            limit=true;
                        }
                    } else {
                        //Check if it is an ally
                        if (start.getPiece().getColor() == board.getSpot(x, i).getPiece().getColor()) {
                        } else {
                            availables.add(board.getSpot(x, i));
                        }
                        limit = true;
                    }
                }
            }
        }


        //BISHOP PROPERTIES

        //The list of all available spot in the diagonal / (check up)
        int i=x-1;
        int j=y+1;
        limit=false;

        while (limit==false && i>=0 && j<8) {
            //check if the spot is empty
            if (board.getSpot(i, j).getPiece() == null) {
                availables.add(board.getSpot(i, j));

            } else {
                //Check if it is an ally
                if (start.getPiece().getColor() == board.getSpot(i, j).getPiece().getColor()) {
                } else {
                    availables.add(board.getSpot(i, j));
                }
                limit = true;
            }
            i--;
            j++;
        }


        //The list of all available spot in the diagonal / (check down)
        i=x+1;
        j=y-1;
        limit=false;

        while (limit==false && i<8 && j>=0) {
            //check if the spot is empty
            if (board.getSpot(i, j).getPiece() == null) {
                availables.add(board.getSpot(i, j));

            } else {
                //Check if it is an ally
                if (start.getPiece().getColor() == board.getSpot(i, j).getPiece().getColor()) {
                } else {
                    availables.add(board.getSpot(i, j));
                }
                limit = true;
            }
            i++;
            j--;
        }


        //The list of all available spot in the diagonal \ (check up)
        i=x-1;
        j=y-1;
        limit=false;

        while (limit==false && i>=0 && j>=0) {
            //check if the spot is empty
            if (board.getSpot(i, j).getPiece() == null) {
                availables.add(board.getSpot(i, j));

            } else {
                //Check if it is an ally
                if (start.getPiece().getColor() == board.getSpot(i, j).getPiece().getColor()) {
                } else {
                    availables.add(board.getSpot(i, j));
                }
                limit = true;
            }
            i--;
            j--;
        }


        //The list of all available spot in the diagnoal \ (check down)
        i=x+1;
        j=y+1;
        limit=false;

        while (limit==false && i<8 && j<8) {
            //check if the spot is empty
            if (board.getSpot(i, j).getPiece() == null) {
                availables.add(board.getSpot(i, j));

            } else {
                //Check if it is an ally
                if (start.getPiece().getColor() == board.getSpot(i, j).getPiece().getColor()) {
                } else {
                    availables.add(board.getSpot(i, j));
                }
                limit = true;
            }
            i++;
            j++;
        }

        return availables;
    }




    }

