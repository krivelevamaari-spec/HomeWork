package dz1;

import java.util.Scanner;

public class SwVowelConsonant {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char lett = scanner.next().charAt(0);

        char originalChar = 'A';
        char lowerCaseLetter = Character.toLowerCase(originalChar);

        switch (lett) {
            case 'e':
            case 'y':
            case 'u':
            case 'i':
            case 'o':
            case 'a':
                System.out.println("it's a vowel");
                break;
            case 'q':
            case 'w':
            case 'r':
            case 't':
            case 'p':
            case 's':
            case 'd':
            case 'f':
            case 'g':
            case 'h':
            case 'j':
            case 'k':
            case 'l':
            case 'z':
            case 'x':
            case 'c':
            case 'v':
            case 'b':
            case 'n':
            case 'm':
                System.out.println("it's a consonants");
                break;
            default:
                System.out.println("Is default");
        }
    }
}
