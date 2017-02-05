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
//program prompts user to enter string and return reversed string
public class ch5q46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to be reversed: ");
        String string = sc.nextLine();
        
        int length = string.length();
        String reverseString = "";
        for (int i=0; i<length; i++){
            reverseString = reverseString + string.substring(length - (1+i), length-i);
        }
        System.out.println(reverseString);
    }
}
