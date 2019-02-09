package homework3;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        int[] array1 = {2, 3, 10, 12};
        int[] array2 = {1, 5, 8, 9};
        int[] arrayFinal = new int[array1.length + array2.length];
        for (int i = 0; i < arrayFinal.length / 2; i++) {

            arrayFinal[i + i] = array1[i];
            arrayFinal[i + i + 1] = array2[i];
        }

        System.out.println(Arrays.toString(arrayFinal));
    }
}