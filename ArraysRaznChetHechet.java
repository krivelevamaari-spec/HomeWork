package dz2;

import java.util.Arrays;

public class ArraysRaznChetHechet {
    public void ArraysRazn () {

        int[] arr = {25, 58, 22, 1, 46, 74};
        int sumChet = 0;

        for (int num : arr) {
            if(num % 2 == 0) {
                sumChet += num;
            }
        }
        int sumNechet = 0;

        for (int num1 : arr) {
            if(num1 % 2 !=0) {
                sumNechet += num1;
            }
        }
        int differ = sumChet - sumNechet;
        System.out.print(differ);
    }
}

