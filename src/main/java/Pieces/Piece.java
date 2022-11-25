package Pieces;

import Auxiliary.Board;
import Auxiliary.Spot;

import java.util.ArrayList;
import java.util.List;

public abstract class Piece {

    private boolean color; //true for white, false for black
    private int value;
    private boolean Hasmoved;
    private String type;
    public Piece(boolean color, int value, boolean hasmoved, String name) {
        this.color = color;
        this.value=value;
        this.Hasmoved=hasmoved;
        this.type=name;
    }

    public boolean GetHasmoved() {
        return Hasmoved;
    }

    public void setHasmoved(boolean hasmoved) {
        Hasmoved = hasmoved;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean getColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    //Method to return all available spots on the board of a piece (by considering all conditions)
    public abstract List<Spot> available_spot(Board board, Spot start) throws Exception;

    //Method that returns All attacked spot by the opponent (it returns N times the same spot if this spot is attacked N times)
    //This method will only be called in King class
    public List<Spot> attacked_spot(Board board) throws Exception {
        List<Spot> attacked_spot=new ArrayList<>();
        List<Spot> availables=new ArrayList<>();

        //On all board
        for (int i=0; i<8; i++){
            for (int j=0; j<8; j++){

                //if the spot on board isn't empty And it is an ennemy
                if (board.getSpot(i,j).getPiece()!=null &&
                        board.getSpot(i,j).getPiece().getColor()!=this.color){

                    //if it is a Pawn
                    if (board.getSpot(i,j).getPiece().getType()=="Pawn"){
                        //On white side:
                        if (this.color==true){
                            if (i<7 && j>0) {
                                attacked_spot.add(board.getSpot(i + 1, j - 1));
                            }
                            if (i<7 && j<7) {
                                attacked_spot.add(board.getSpot(i + 1, j + 1));
                            }
                        }

                        //On black side:
                        if (this.color==false){
                            if (i>0 && j<7) {
                                attacked_spot.add(board.getSpot(i - 1, j+1));
                            }
                            if (i>0 && j>0) {
                                attacked_spot.add(board.getSpot(i - 1, j - 1));
                            }
                        }
                    }

                    //If it is anything else than a PAWN
                    else{
                        //Check all of the move of the ennemy piece
                        availables = board.getSpot(i,j).getPiece().available_spot(board, board.getSpot(i,j));

                        //Increment all available moves of ennemy in attacked_spot
                        if (availables.size()!=0) {
                            for (int k = 0; k<availables.size(); k++) {
                                attacked_spot.add(availables.get(k));
                            }
                        }

                    }
                }
            }
        }

        for (int i=0; i<attacked_spot.size(); i++){
            attacked_spot.get(i).DisplayCoordinate();
        }
        return attacked_spot;
    }

    public String getType() {
        return type;
    }

    public void DisplayPieces(){
        System.out.println("The piece hasmoved:"+Hasmoved);
        System.out.println("The piece color:"+color);
    }

    public void setType(String type) {
        this.type = type;
    }


}
