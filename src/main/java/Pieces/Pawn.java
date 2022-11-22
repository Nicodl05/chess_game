package Pieces;

import Auxiliary.Board;
import Auxiliary.Spot;

import java.util.ArrayList;
import java.util.List;

public class Pawn extends Piece{
    public Pawn(boolean alive, boolean color) {
        super(alive, color, 1);
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
        List<Spot> availables = new ArrayList<>();
        int x=start.getX();
        int y=start.getY();
        boolean limit=false;




        return null;
    }


    public void Movement(Board board, Spot start) {
        List<Spot> available = new ArrayList<>();
        Spot tosave = start;
        Spot tocheck = new Spot(); // Penser à faire le check du movement pour le début (2 cases)
        int x = start.getX();
        int y = start.getY();
        if(start.getPiece().getColor()){
            x-=1;
            tocheck.setX(x);
            if(!tocheck.isOccupied()){
                available.add(tocheck);
            }
            y-=1;
            tocheck.setY(y);
            if(tocheck.isOccupied() && !tocheck.getPiece().getColor())
                available.add(tocheck);
            y+=2;
            tocheck.setY(y);
            if(tocheck.isOccupied() && !tocheck.getPiece().getColor())
                available.add(tocheck);
        }
        else{
            x+=1;
            tocheck.setX(x);
            if(!tocheck.isOccupied()){
                available.add(tocheck);
            }
            y-=1;
            tocheck.setY(y);
            if(tocheck.isOccupied() && tocheck.getPiece().getColor())
                available.add(tocheck);
            y+=2;
            tocheck.setY(y);
            if(tocheck.isOccupied() && tocheck.getPiece().getColor())
                available.add(tocheck);
        }
        }


    }

