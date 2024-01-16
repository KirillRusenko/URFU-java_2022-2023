package LR1;

import java.time.Year;
import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        int birth;
        Scanner in = new Scanner(System.in);

        System.out.println("Пожалуйста введите ваш год рождения");
        birth = in.nextInt();

        int age = Year.now().getValue() - birth;

        System.out.println("Ваш возраст: " + age);
        in.close();

    }
}
