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
public class ch5ques47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int checkSum;
        String isbn;
        System.out.println("Enter the first 12 digits of an ISBN-13: ");
        isbn = sc.nextLine();
        if (isbn.length() != 12){
            System.out.println(isbn + "is an invalid input.");
        }
        else{
        int sum1 = 0;
        int sum3 = 0;
        for(int i = 0; i<11; i=i+2){
            sum1 = sum1 +Integer.parseInt(isbn.substring(i,i+1));
        }
       for (int j = 1; j<12; j=j+2){
           sum3 = sum3 + 3*Integer.parseInt(isbn.substring(j, j+1));
       }
        checkSum = 10-(sum1+sum3)%10;
        if (checkSum==10){
            checkSum = 0;
        }
        String isbn13 = isbn + Integer.toString(checkSum);
        System.out.println(isbn13);
//        int d1 = Integer.parseInt(isbn.substring(0,1));
//        int d2 = Integer.parseInt(isbn.substring(1,2));
//        int d3 = Integer.parseInt(isbn.substring(2,3));
//        int d4 = Integer.parseInt(isbn.substring(3,4));
        }
      
    }
}
