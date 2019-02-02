package homework2;

import java.util.Scanner;

public class Task1 {
    public static void main (String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число");
            int value = scanner.nextInt();
            int result = 0;
            while ((value / 10 != 0) || (value % 10 != 0)) {
                result += value % 10;
                value /= 10;
            }
            System.out.println("Сумма цифр = " + result);
        }
    }
