package dz1;

import java.util.Scanner;

public class ForTwoNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        int start = num1;
        int end = num2;

        int sum = 0;

        for (int z = start+1; z < end;  ) {
            if (z % 3 == 0) {
                sum = sum + z;
            }
        }
        System.out.print(" ");

    }
}
