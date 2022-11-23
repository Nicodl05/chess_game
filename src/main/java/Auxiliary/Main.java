package Auxiliary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TO REVERSE HORIZONTALLY: https://stackoverflow.com/questions/28130828/horizontal-transformation-of-array-2d


public class Main {
    public static void main(String[] args) throws Exception {
    Board test=new Board();
    Spot start;
    Spot end;
    test.displayBoard();
    Player player1=new Player(true, "Aziz");
    start=player1.ChooseSpotStart(test);
    end=player1.ChooseSpotEnd(test, start);
    test.Move(start, end);
    test.displayBoard();

}
}