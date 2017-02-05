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
public class ch5ques49 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to be analyzed for vowels and consonants (do not include any punctuation): ");
        String string = sc.nextLine();
        string = string.toLowerCase();
        int length = string.length();
        int vowels = 0;
        int cons = 0;
        for (int i = 0; i < length; i++) {
            if (string.charAt(i) >= 'a' && string.charAt(i) <= 'z') {
            if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u') {
                vowels = vowels + 1;
            }
            else{
                cons = cons +1;
            }
            
        }}
        System.out.println("The number of vowels is " + vowels+".");
        System.out.println("The number of consonants is " + cons+".");
    }
}
