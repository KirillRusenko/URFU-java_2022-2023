package LR1;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        String week;
        String month;
        int date;
        Scanner in = new Scanner(System.in);


        System.out.println("Пожалуйста введите название текущего дня недели");
        week = in.nextLine();

        System.out.println("Пожалуйста введите название текущего месяца");
        month = in.nextLine();

        System.out.println("Пожалуйста введите название сегодняшнюю дату (номер дня в месяце)");
        date = in.nextInt();

        System.out.println("День недели: " + week);
        System.out.println("Дата: " + date);
        System.out.println("Месяц: " + month);

        in.close();
    }
}
