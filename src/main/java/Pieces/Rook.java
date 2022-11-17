package Pieces;

import Auxiliary.Board;
import Auxiliary.Spot;

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
}
