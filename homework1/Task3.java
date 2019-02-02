package homework1;

import java.util.Scanner;

public class Task3 {
    public static void main (String[] args) {
        Scanner sccanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = sccanner.nextInt();
        System.out.println("Введите второе число");
        int b = sccanner.nextInt();
        System.out.println("Введите третье число");
        int c = sccanner.nextInt();

        double discrim = discriminant (a, b, c);
        if (!isPositive(discrim)) {
            System.out.println("Дискриминант < 0. Уравнение не имеет действительных корней");
        } else {
            double rootFirst = (-b - Math.sqrt(discrim)) / (2 * a);
            double rootSecond = (-b + Math.sqrt(discrim)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + rootFirst + ", x2 = " + rootSecond);
        }
        if (isZero(discrim)) {
            double root = (b * (-1) + Math.sqrt(discrim)) / (2 * a);
            System.out.println("Уравнение имеет единственный корень: x = " + root);
        }
    }
    static boolean isPositive(double d) {
        return (d > 0);
    }
    static boolean isZero(double z) {
        return (z == 0);
    }
    static double discriminant (int a, int b, int c) {
        return (b * b - 4 * a * c);
    }
}
