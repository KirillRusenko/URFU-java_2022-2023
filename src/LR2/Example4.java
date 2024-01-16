package LR2;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Пожалуйста введите число для проверки: ");
        int x = scanner.nextInt();

        if (x >= 5 && x <= 10) {
            System.out.println("Число удовлетворяет критериям.");
        } else {
            System.out.println("Число не удовлетворяет критериям.");
        }
    }
}
