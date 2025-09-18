package dz1;

import java.util.Scanner;

public class IfVowelConsonant {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char lett = scanner.next().charAt(0);

        char originalChar = 'A';
        char lowerCaseChar = Character.toLowerCase(originalChar);


        if (lett == 'e' || lett == 'y' || lett == 'u' || lett == 'i' || lett == 'o' || lett == 'a') {
            System.out.println("it's a vowel");
        } else if (lett == 'q' || lett == 'w' || lett == 'r' || lett == 't' || lett == 'p' || lett == 's' ||
                   lett == 'd' || lett == 'f' || lett == 'g' || lett == 'h' || lett == 'j' || lett == 'k' ||
                   lett == 'l' || lett == 'z' || lett == 'x' || lett == 'c' || lett == 'v' || lett == 'b' ||
                   lett == 'n' || lett == 'm') {
            System.out.println("it's a consonants");
        } else {
            System.out.println("it's not letter");
        }








    }








}
