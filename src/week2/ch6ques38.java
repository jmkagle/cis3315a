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
public class ch6ques38 {
    public static char getRandomCharacter(char ch1, char ch2){
        return (char)(ch1+Math.random()*(ch2-ch1+1));
    }
    public static char getRandomUpperCase(){
        return getRandomCharacter('A','Z');
    }
    public static char getRandomDigitChar(){
        return getRandomCharacter('0', '9');
    }
    public static void main(String[] args) {
        for (int i=0; i<10; i++){
            String upperString = "" ;
            for(int j = 0; j<10; j++){
                upperString = upperString + getRandomUpperCase();
            }
            System.out.println(upperString);
        }
        for (int k=0; k<10; k++){
            String digitString = "" ;
            for(int l = 0; l<10; l++){
                digitString = digitString + getRandomDigitChar();
            }
            System.out.println(digitString);
        }
    }
}
