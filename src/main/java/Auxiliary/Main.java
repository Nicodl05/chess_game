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
    Spot start2;
    Spot end2;
    Player player1=new Player(true, "Aziz");
    Player player2=new Player(false, "Selim");
    List <Spot> attacked;
    int i = 0;
    do {
        test.displayBoard();
        start = player1.ChooseSpotStart(test);
        end = player1.ChooseSpotEnd(test, start);
        test.Move(start, end);
        test.displayBoard();
        start2 = player2.ChooseSpotStart(test);
        end2 = player2.ChooseSpotEnd(test, start2);
        test.Move(start2, end2);
        i++;
    } while (i<25);

    

}
}