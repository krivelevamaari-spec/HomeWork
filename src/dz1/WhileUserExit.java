package dz1;

import java.util.Scanner;

public class WhileUserExit {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        while (true){
            System.out.print("Введите заветное слово: ");
            String input = scanner.nextLine();

            if (input.equals("exit")) {
                break;
            } else {
                System.out.print("Это провал ");
            }

        }

    }

}
