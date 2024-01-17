package LR3;

import java.util.Arrays;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[]array = new int[2];
        System.out.print("Введите первое целое число: ");
        array[0] = input.nextInt();

        System.out.print("Введите второе целое число: ");
        array[1] = input.nextInt();


        Arrays.sort(array);
        int i = 0;
        System.out.println("Числа по возрастанию(while): ");
        while (i <= 1) {
            System.out.println(array[i]);
            i++;
        }

        System.out.println("Числа по возрастанию(for): ");
        for(i = 0; i<=1;i++){
            System.out.println(array[i]);
        }

        input.close();
    }
}
