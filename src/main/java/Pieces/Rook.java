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
    public void Movement(Board board, Spot start) {
        List<Spot> available = new ArrayList<>();
        Spot tosave = start;
        Spot tocheck = new Spot();
        int up = 0;
        int x = start.getX();
        int y = start.getY(); //
        do{
            if(up==0){
                x-=1;
                tocheck.setX(x);
                if(!tocheck.isOccupied()){
                    available.add(tocheck);
                }
                if(tocheck.getPiece().getColor()!=start.getPiece().getColor()){
                    available.add(tocheck);
                    up=1;
                }
                if(x==0)
                    up=1;
            }
            if(up==1){
                x+=1;
                tocheck.setX(x);
                if(!tocheck.isOccupied()){
                    available.add(tocheck);
                }
                if(tocheck.getPiece().getColor()!=start.getPiece().getColor()){
                    available.add(tocheck);
                    up=1;
                }
                if(x==7)
                    up=2;
            }
            if(up==2){
                y+=1;
                tocheck.setY(y);
                if(!tocheck.isOccupied()){
                    available.add(tocheck);
                }
                if(tocheck.getPiece().getColor()!=start.getPiece().getColor()){
                    available.add(tocheck);
                    up=1;
                }
                if(y==7)
                    up=3;
            }
            if(up==3){
                y-=1;
                tocheck.setY(y);
                if(!tocheck.isOccupied()){
                    available.add(tocheck);
                }
                if(tocheck.getPiece().getColor()!=start.getPiece().getColor()){
                    available.add(tocheck);
                    up=1;
                }
                if(y==0)
                    up=4;
            }
        }while(up!=4);

    }
}
