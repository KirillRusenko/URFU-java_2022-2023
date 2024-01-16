package LR1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        int a;
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число");
        a = in.nextInt();

        int c = a - 1;
        int b = a + 1;
        int d = (a+c+b)*(a+c+b);

        System.out.println("Число, на единицу меньше введённого " + c);
        System.out.println("Введенное число " + a);
        System.out.println("Число, на единицу больше введенного " + b);
        System.out.println("Квадрат суммы первых трех чисел " + d);

        in.close();
    }
}