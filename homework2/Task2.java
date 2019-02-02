package homework2;

import java.util.Scanner;

public class Task2 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int value = scanner.nextInt();
        int fib1 = 0;
        int fib2 = 1;
        int fib3 = fib1 + fib2;
        System.out.print(fib1 + " ");
        while (fib3 < value) {
            System.out.print(fib3 + " ");
            fib3 = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib3;
        }
    }
}
