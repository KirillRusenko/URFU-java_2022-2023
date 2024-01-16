package LR1;

import java.time.Year;
import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        int age;
        Scanner in = new Scanner(System.in);

        System.out.println("Пожалуйста введите ваш возраст");
        age = in.nextInt();

        int birth = Year.now().getValue() - age;

        System.out.println("Ваш год рождения: " + birth);
        in.close();
    }
}
