/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;
import java.util.Scanner;
/**
 *
 * @author Jeanne Kagle
 */
public class ch6ques37 {

    public static String format(int number, int width){
        String string = Integer.toString(number);
        if (string.length() >= width){
            string = string;
        }
        else{
            int addOn = width - string.length();
            for (int i = 0; i<addOn; i++){
                string = "0"+string;
            }
        }
        return string;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = Integer.parseInt(sc.nextLine());
        System.out.println("Enter your width: ");
        int width = Integer.parseInt(sc.nextLine());
        String string = format(number, width);
        System.out.println("Your new string is "+string);
    }
}
