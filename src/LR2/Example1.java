package LR2;

import java.util.Scanner;


public class Example1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Пожалуйста ведите любое целое число");
        int x = in.nextInt();

        if (x % 3 == 0) {
            System.out.println("Введенное число делится на 3 без остатка");
        } else {
            System.out.println("Введенное число не делиться на 3 без остатка");

        }

    }

}
