package Pieces;

import Auxiliary.Board;
import Auxiliary.Spot;

import java.util.List;

public abstract class Piece {

    private boolean alive; //false if piece alive
    private boolean color; //true for white, false for black
    private int value;

    public Piece(boolean alive, boolean color, int value) {
        this.alive = alive;
        this.color = color;
        this.value=value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean getAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public boolean getColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    public abstract boolean canMove(Board board,
                                    Spot start, Spot end);

    //Method to return all available spots on the board of a piece (by considering all conditions)
    public abstract List<Spot> available_spot(Board board, Spot start) throws Exception;
}
