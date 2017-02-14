/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;
import java.util.Scanner;
/**
 *
 * @author 55jkagle
 */
public class ChessUI {
    public static void main(String[] args) {
        ChessBoard chess = new ChessBoard();
        Scanner sc = new Scanner(System.in);
        //display move
        String play = "yes";
        while(play.equals("yes")){
            chess.whoseMove();
        if (chess.whoseMove()==0){
        System.out.println(chess.toString());
        //have white player enter move
        System.out.println("White player, from what space do you want to move?");
        System.out.println("Row: ");
        int rowFromW = sc.nextInt();
        System.out.println("Column: ");
        int colFromW = sc.nextInt();
        System.out.println("White player, to what space do you want to move?");
        System.out.println("Row: ");
        int rowToW = sc.nextInt();
        System.out.println("Column: ");
        int colToW = sc.nextInt();
        //make move (update board)
        chess.move(rowFromW, colFromW, rowToW, colToW);
        }
        else if (chess.whoseMove()==1){
            System.out.println(chess.toString());
        //have white player enter move
        System.out.println("Black player, from what space do you want to move?");
        System.out.println("Row: ");
        int rowFromB = sc.nextInt();
        System.out.println("Column: ");
        int colFromB = sc.nextInt();
        System.out.println("Black player, to what space do you want to move?");
        System.out.println("Row: ");
        int rowToB = sc.nextInt();
        System.out.println("Column: ");
        int colToB = sc.nextInt();
        //make move (update board)
        chess.move(rowFromB, colFromB, rowToB, colToB);
        }
        }
        //have black player enter move
        
        //make move (update board)
    }
}
