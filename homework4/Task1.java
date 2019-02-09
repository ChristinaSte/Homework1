package homework4;


import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String S = scanner.next();
        isPolindrome(S);
        System.out.println(isPolindrome(S));

    }

    public static boolean isPolindrome(String text) {
        text = text.replaceAll("\\W", "");
        StringBuilder strBuilder = new StringBuilder(text);
        strBuilder.reverse();
        String invertedText = strBuilder.toString();
        return text.equalsIgnoreCase(invertedText);
    }
}
