package Pieces;

import Auxiliary.Board;
import Auxiliary.Spot;

import java.util.ArrayList;
import java.util.List;

public class Pawn extends Piece{
    private boolean Hasmoved;
    public Pawn(boolean alive, boolean color) {
        super(alive, color, 1);
        Hasmoved=false;
    }

    @Override
    public boolean canMove(Board board, Spot start, Spot end) {
        // we can't move the piece to a spot that is occupied by a piece of the same color
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

        //White side:
        if ( start.getPiece().getColor()==true && x>0){

            if (this.Hasmoved==false) {
                if (board.getSpot(x - 2, y).getPiece() == null) {
                    availables.add(board.getSpot(x - 2, y));
                }
            }
            if (board.getSpot(x - 1, y).getPiece() == null) {
                availables.add(board.getSpot(x - 1, y));
            }

            //Capture
            //LEFT SIDE UP
            if (y>0) {
                if (board.getSpot(x - 1, y - 1).getPiece() != null &&
                        board.getSpot(x - 1, y - 1).getPiece().getColor() != start.getPiece().getColor()) {
                    availables.add(board.getSpot(x - 1, y-1));
                }
            }

            //RIGHT SIDE UP
            if (y<7) {
                if (board.getSpot(x - 1, y + 1).getPiece() != null &&
                        board.getSpot(x - 1, y + 1).getPiece().getColor() != start.getPiece().getColor()) {
                    availables.add(board.getSpot(x - 1, y+1));
                }
            }
        }


        if (start.getPiece().getColor()==false && x<7){
            if (this.Hasmoved==false) {
                if (board.getSpot(x + 2, y).getPiece() == null) {
                    availables.add(board.getSpot(x + 2, y));
                }
            }
            if (board.getSpot(x + 1, y).getPiece() == null) {
                availables.add(board.getSpot(x + 1, y));
            }

            //Capture
            //LEFT SIDE DOWN
            if (y>0) {
                if (board.getSpot(x + 1, y - 1).getPiece() != null &&
                        board.getSpot(x + 1, y - 1).getPiece().getColor() != start.getPiece().getColor()) {
                    availables.add(board.getSpot(x + 1, y-1));
                }
            }

            //RIGHT SIDE DOWN
            if (y<7) {
                if (board.getSpot(x + 1, y + 1).getPiece() != null &&
                        board.getSpot(x + 1, y + 1).getPiece().getColor() != start.getPiece().getColor()) {
                    availables.add(board.getSpot(x + 1, y+1));
                }
            }
        }
        return availables;
    }


    public boolean Hasmoved() {
        return Hasmoved;
    }

    public void setHasmoved(boolean hasmoved) {
        Hasmoved = hasmoved;
    }


    }

