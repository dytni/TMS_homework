package Lesson_5.Lesson_5_Task_3;

import java.util.Scanner;

public class Lesson_5_Task_3 {
    public static void main(String[] args) {
        System.out.println("Enter count of banknotes with denomination 20 ");
        Scanner scanner = new Scanner(System.in);
        int count_20 = scanner.nextInt();
        System.out.println("Enter count of banknotes with denomination 50 ");
        int count_50 = scanner.nextInt();
        System.out.println("Enter count of banknotes with denomination 100 ");
        int count_100 = scanner.nextInt();
        ATM atm = new ATM(count_20,count_50,count_100);
        System.out.println("Enter sum witch you want to take");
        int sum = scanner.nextInt();
        atm.take_money(sum);
    }
}
