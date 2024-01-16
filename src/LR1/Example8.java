package LR1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner in = new Scanner(System.in);

        System.out.println("Пожалуйста введите первое число");
        a = in.nextInt();
        System.out.println("Пожалуйста введите второе число");
        b = in.nextInt();

        System.out.println("Сумма двух чисел равна " + (a + b));
        in.close();
    }
}
