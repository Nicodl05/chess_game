package Pieces;

import Auxiliary.Board;
import Auxiliary.Spot;

import java.util.ArrayList;
import java.util.List;

public class Bishop extends Piece{
    public Bishop(boolean alive, boolean color) {
        super(alive, color, 3);
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

        //The list of all available spot in the diagonal / (check up)
        int i=x-1;
        int j=y+1;
        boolean limit=false;

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

    public void Movement(Board board, Spot start){
        List <Spot> available = new ArrayList<>();
        Spot tosave=start;
        Spot tocheck = new Spot();
        int up=0;
        int x = start.getX();
        int y = start.getY();
        do{
            if(up==0){
                x-=1;
                y=-1;
                tocheck.setX(x);
                tocheck.setY(y);
                if(!tocheck.isOccupied()){
                    available.add(tocheck);
                }
                if(tocheck.getPiece().getColor()!=start.getPiece().getColor()){
                    available.add(tocheck);
                    up=1;
                }
                if(x==0||y==0)
                    up=1;
            }
            if(up==1){
                x+=1;
                y+=1;
                tocheck.setX(x);
                tocheck.setY(y);
                if(!tocheck.isOccupied()){
                    available.add(tocheck);
                }
                if(tocheck.getPiece().getColor()!=start.getPiece().getColor()){
                    available.add(tocheck);
                    up=2;
                }
                if(x==7||y==7)
                    up=2;
            }
        }while(up!=2);
        up=0;
        do{
            if(up==0){
                x+=1;
                y=-1;
                tocheck.setX(x);
                tocheck.setY(y);
                if(!tocheck.isOccupied()){
                    available.add(tocheck);
                }
                if(tocheck.getPiece().getColor()!=start.getPiece().getColor()){
                    available.add(tocheck);
                    up=1;
                }
                if(x==7||y==0)
                    up=1;
            }
            if(up==1){
                x-=1;
                y+=1;
                tocheck.setX(x);
                tocheck.setY(y);
                if(!tocheck.isOccupied()){
                    available.add(tocheck);
                }
                if(tocheck.getPiece().getColor()!=start.getPiece().getColor()){
                    available.add(tocheck);
                    up=2;
                }
                if(x==0||y==7)
                    up=2;
            }
        }while(up!=2);



    }
}
