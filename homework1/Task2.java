package homework1;

import java.util.Scanner;

public class Task2 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ширину первого дома: ");
        int widthFirst = scanner.nextInt();
        System.out.println("Введите длину первого дома: ");
        int lengthFirst = scanner.nextInt();
        System.out.println("Введите длину второго дома: ");
        int widthSecond = scanner.nextInt();
        System.out.println("Введите ширину второго дома: ");
        int lengthSecond = scanner.nextInt();

        int plotWidth = 12;
        int plotLength = 18;

        if ((widthFirst > plotWidth || lengthFirst > plotLength) || (widthSecond > plotWidth) || lengthSecond > plotWidth){
            System.out.println("Дома не помещаются"); // ПРОВЕРЬ Нужно ли 4-е условие
        }   else if (widthFirst + widthSecond <= plotWidth && lengthFirst + lengthSecond <= plotLength) {
            System.out.println("Дома помещаются");
        }   else if (widthFirst + lengthSecond <= plotWidth || lengthFirst + widthSecond <= plotLength) {
            System.out.println("Дома помещаются");
        }
    }
}
