package dz1;

import java.util.Scanner;

public class TimeOfYear {

    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название месяца: ");
        String month = scanner.nextLine().toLowerCase();

        String season;

        switch (month) {

            case "март":
            case "апрель":
            case "май":
                System.out.println("Это весна!");
                break;
            case "июнь":
            case "июль":
            case "август":
                System.out.println("Это лето!");
                break;
            case "сентябрь":
            case "октябрь":
            case "ноябрь":
                System.out.println("Это осень!");
                break;
            case "декабрь":
            case "январь":
            case "февраль":
                System.out.println("Это зима!");
                break;
            default:
                System.out.println("Это провал");


        }

    }
}
