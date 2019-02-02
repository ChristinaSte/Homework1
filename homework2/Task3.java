package homework2;

import java.util.Scanner;

public class Task3 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int bsum = 0;
        int dmax = 0;
        for (int i = 1; i < n; i++) {
            System.out.println("введите количество осадков за день " + i);
            int curr = scanner.nextInt();
            System.out.println("всего за " + i + " дней:");
            bsum = bsum + curr;
            System.out.println("сумма осадков =" + bsum);
            System.out.println("среднее количество осадков =" + bsum / i);
            if (curr > dmax) {
                dmax = curr;
            }
            System.out.println("максимальное количество осадков =" + dmax);
        }
    }
}
