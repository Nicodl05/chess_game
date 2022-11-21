package Auxiliary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
    Board test=new Board();
    test.displayBoard();
    Player player1=new Player(true, "Aziz");
    player1.ChooseSpot(test);


}
}