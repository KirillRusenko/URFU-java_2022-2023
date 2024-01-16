package LR1;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        String name;
        int age;
        Scanner in = new Scanner(System.in);

        System.out.println("Пожалуйста введите ваше имя");
        name = in.nextLine();

        System.out.println("Пожалуйста введите ваш возраст");
        age = in.nextInt();

        System.out.println("Ваше имя: " +name);
        System.out.println("Ваш взораст: " +age);

        in.close();

    }
}