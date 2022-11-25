package Pieces;

import Auxiliary.Board;
import Auxiliary.Spot;

import java.util.ArrayList;
import java.util.List;

public class King extends Piece{
    public King(boolean color, boolean hasmoved) {
        super(color, 0, hasmoved, "King");
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
                    availables.add(board.getSpot(x - 1, y));
            }
        }

        //Above Right King
        if (x>0 && y<7){
            if (board.getSpot(x-1, y+1 ).getPiece() == null
                    || board.getSpot(x-1, y+1 ).getPiece().getColor() != start.getPiece().getColor()) {
                availables.add(board.getSpot(x-1, y+1));}
        }

        //Above Left King
        if (x>0 && y>0){
            if (board.getSpot(x-1, y-1 ).getPiece() == null
                    || board.getSpot(x-1, y-1 ).getPiece().getColor() != start.getPiece().getColor()) {
                availables.add(board.getSpot(x-1, y-1));}

        }

        //Below Left King
        if (x<7 && y>0){
            if (board.getSpot(x+1, y-1 ).getPiece() == null
                    || board.getSpot(x+1, y-1 ).getPiece().getColor() != start.getPiece().getColor()) {
                    availables.add(board.getSpot(x + 1, y - 1));
            }
        }

        //Below Right King
        if (x<7 && y<7){
            if (board.getSpot(x+1, y+1 ).getPiece() == null
                    || board.getSpot(x+1, y+1 ).getPiece().getColor() != start.getPiece().getColor()) {
                    availables.add(board.getSpot(x + 1, y + 1));
            }
        }

        //Method TO DO:
        //1: We must retire all attacked spots from available_spots for the king
        //2: Parcourir toutes les attacked spot et detecter si un de ces spots est celui de notre roi
        //3: Partir du 1 et 2 pour faire les échecs...

        return availables;
    }

    /*DOESN T WORK YET
    public boolean Check_King(Board board, Spot King_Spot) throws Exception {

        //Get all attacked spots
        List <Spot> unvalid_spots=attacked_spot(board);

        //For all attacked spots
        for (int i=0; i<unvalid_spots.size(); i++){
            //if the king wants to move to an attacked spot
            if (spot_tocheck==unvalid_spots.get(i)){
                return false;
            }
        }
        return true;
    }*/
}
