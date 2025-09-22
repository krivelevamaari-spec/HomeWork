package dz2;

import java.util.Arrays;

public class ArraysMinMax {

    public void ArraysM () {

        int[] arr = {15, 8, 36, 2, 69, 53};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int min = arr[0];
        int max = arr[arr.length-1];
        int sum = max + min;
        System.out.println(sum);
    }
}
