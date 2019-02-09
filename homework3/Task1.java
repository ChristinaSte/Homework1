package homework3;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] value = {0, 1, 2, 3, 4, 5, 6};

            moveRight(value, 1);
            System.out.println(Arrays.toString(value));

        value = new int[]{0, 1, 2, 3, 4, 5, 6};

        }

        public static void moveRight ( int[] array, int positions){
            int size = array.length;

            for (int i = 0; i < positions; i++) {
                int temp = array[size - 1];

                for (int j = size - 1; j > 0; j--) {
                    array[j] = array[j - 1];
                }

                array[0] = temp;
            }
        }

}


