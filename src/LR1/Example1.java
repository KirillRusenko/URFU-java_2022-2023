package LR1;

import java.util.Scanner;
public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите ваше имя: ");
        String name = in.nextLine();

        System.out.println("Введите ваш возраст: ");
        int age = in.nextInt();

        System.out.println("Введите ваш рост: ");
        float height = in.nextFloat();

        System.out.printf("Name: %s Age: %d Height: %.2f \n", name, age, height);
        in.close();

    }
}