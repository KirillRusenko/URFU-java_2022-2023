package LR2;

import java.util.Scanner;

public class Example5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Пожалуйста введите число для проверки: ");
        int x = scanner.nextInt();

        System.out.println("В числе " + x + " находится " + (x / 1000) + " тысяч");
        System.out.println("В числе " + x + " четвертая цифра справа в десятичном представлении числа: " + (x / 1000) % 10);
    }
}