package homework2;

import java.util.Scanner;

public class Task21 {
    public static void main (String [] args){
        System.out.println("Введите число: ");
        int number = new Scanner(System.in).nextInt();
        for (int i=1; i <= number; i++){
            System.out.print(fibonacci2(i) + " ");
        }
    }
    public static int fibonacci2(int number) {
        if(number == 1 || number == 2) {
            return 1;
        }
        return fibonacci2(number - 1) + fibonacci2(number - 2);
    }
}
