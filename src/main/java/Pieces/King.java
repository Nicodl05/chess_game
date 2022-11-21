package Pieces;

import Auxiliary.Board;
import Auxiliary.Spot;

import java.util.List;

public class King extends Piece{
    public King(boolean alive, boolean color) {
        super(alive, color, 0);
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
    public List<Spot> available_spot(Board board, Spot start) {
        return null;
    }
}
