package LR1;

import java.util.Scanner;
public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите вашу фамилию: ");
        String surname = in.nextLine();

        System.out.println("Введите ваше имя: ");
        String name = in.nextLine();

        System.out.println("Введите ваше отчество: ");
        String patronymic = in.nextLine();

        System.out.printf("Привет " + surname + " " + name + " " + patronymic);
        in.close();

    }
}