package Pieces;

import Auxiliary.Board;
import Auxiliary.Spot;

import java.util.ArrayList;
import java.util.List;

public class Rook extends Piece {

    public Rook(boolean alive, boolean color) {
        super(alive, color, 5);
    }

    @Override
    public boolean canMove(Board board, Spot start, Spot end) {
        // we can't move the piece to a spot that has a piece of the same colour
        if (end.getPiece().getColor() == this.getColor()) {
            return false;
        } else {
            //HERE WE MUST WRITE THE METHOD OF MOVEMENT OF THIS PIECE
            //FOR NOW, LET'S RETURN ALWAYS TRUE
            return true;
        }

    }

    @Override
    public List<Spot> available_spot(Board board, Spot start) throws Exception {
        List<Spot> availables = new ArrayList<>();
        int x=start.getX();
        int y=start.getY();
        boolean limit=false;

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


        return availables;
    }

}
