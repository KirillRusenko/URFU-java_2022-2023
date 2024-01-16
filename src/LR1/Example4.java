package LR1;

import java.util.Scanner;
public class Example4 {
    public static void main(String[] args) {
        String month;
        int days_number;
        Scanner in = new Scanner(System.in);

        System.out.println("Пожалуйста введите название месяца");
        month = in.nextLine();
        System.out.println("Пожалуйста введите количество дней в этом месяце");
        days_number = in.nextInt();

        System.out.println("Месяц: " + month);
        System.out.println("Количество дней: " + days_number);
        in.close();
    }
}
