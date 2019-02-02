package homework1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату: ");
        int day = scanner.nextInt();
        System.out.println("Введите месяц: ");
        int month = scanner.nextInt();
        System.out.println("Введите год: ");
        int year = scanner.nextInt();

        boolean correctYear = (year >= 1);
        if (!correctYear) {
            System.out.println("Проверьте год");
        }
        boolean leapYear = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
        if (leapYear && month == 2 && day > 29) {
            System.out.println("Проверьте день");
        }
        boolean correctDay = (day >= 1 && day <= 31);
        if (!correctDay) {
            System.out.println("Проверьте день");
        }
        boolean correctMonth = (month >= 1 && month <= 12);
        if (!correctMonth) {
            System.out.println("Проверьте месяц");
            if (month == 12 && day == 31) ;
            {
                System.out.println("Следующая дата: " + (day = 1) + '.' + (month = 1) + '.' + ++year);
            }

        } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) {
            if (day < 31) {
                System.out.println("Следующая дата: " + dateout (day, month, year));
            } else {
                System.out.println("Следующая дата: " + (day = 1) + '.' + ++month + '.' + year);
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day < 30) {
                System.out.println("Следующая дата: " + dateout (day, month, year));
            } else {
                System.out.println("Следующая дата: " + (day = 1) + '.' + ++month + '.' + year);
            }
        } else if (month == 2) {
            if (day < 29) {
                System.out.println("Следующая дата: " + dateout (day, month, year));
            } else {
                System.out.println("Следующая дата: " + (day = 1) + '.' + ++month + '.' + year);
            }
        }
    }

    private static String dateout(int day, int month, int year) {
        String output1 = ++day + "." + month + "." + year;
        return output1;
    }
}