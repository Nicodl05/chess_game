package Pieces;

import Auxiliary.Board;
import Auxiliary.Spot;

import java.util.ArrayList;
import java.util.List;

public class King extends Piece{
    public King(boolean color, boolean hasmoved) {
        super(color, 0, hasmoved);
    }



    @Override
    public List<Spot> available_spot(Board board, Spot start) throws Exception {
        List<Spot> availables = new ArrayList<>();
        int x=start.getX();
        int y=start.getY();

        //On the left of King
        if (y<7) {
            if (board.getSpot(x, y + 1).getPiece() == null
                    || board.getSpot(x, y + 1).getPiece().getColor() != start.getPiece().getColor()) {
                availables.add(board.getSpot(x, y + 1));
            }
        }

        //On the right of King
        if (y>0) {
            if (board.getSpot(x, y - 1).getPiece() == null
                    || board.getSpot(x, y - 1).getPiece().getColor() != start.getPiece().getColor()) {
                availables.add(board.getSpot(x, y - 1));
            }
        }

        //Below the King
        if (x<7) {
            if (board.getSpot(x+1, y).getPiece() == null
                    || board.getSpot(x+1, y ).getPiece().getColor() != start.getPiece().getColor()) {
                availables.add(board.getSpot(x+1, y ));
            }
        }

        //Above the King
        if (x>0) {
            if (board.getSpot(x-1, y ).getPiece() == null
                    || board.getSpot(x-1, y ).getPiece().getColor() != start.getPiece().getColor()) {
                availables.add(board.getSpot(x-1, y));
            }
        }

        //Above Right King
        if (x>0 && y<7){
            if (board.getSpot(x-1, y+1 ).getPiece() == null
                    || board.getSpot(x-1, y+1 ).getPiece().getColor() != start.getPiece().getColor()) {
                availables.add(board.getSpot(x-1, y+1));
            }
        }

        //Above Left King
        if (x>0 && y>0){
            if (board.getSpot(x-1, y-1 ).getPiece() == null
                    || board.getSpot(x-1, y-1 ).getPiece().getColor() != start.getPiece().getColor()) {
                availables.add(board.getSpot(x-1, y-1));
            }
        }

        //Below Left King
        if (x<7 && y>0){
            if (board.getSpot(x+1, y-1 ).getPiece() == null
                    || board.getSpot(x+1, y-1 ).getPiece().getColor() != start.getPiece().getColor()) {
                availables.add(board.getSpot(x+1, y-1));
            }
        }

        //Below Right King
        if (x<7 && y<7){
            if (board.getSpot(x+1, y+1 ).getPiece() == null
                    || board.getSpot(x+1, y+1 ).getPiece().getColor() != start.getPiece().getColor()) {
                availables.add(board.getSpot(x+1, y+1));
            }
        }

        return availables;
    }
}
