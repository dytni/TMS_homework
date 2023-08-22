package Leson_2;

import java.util.Scanner;

public class Task1 {
    /*Написать программу для вывода названия поры года по
номеру месяца. При решении используйте оператор switch-case*/
    public static void main(String[] args) {
        int key;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of month");
        key = input.nextInt();
        switch (key) {
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
        }
    }
}
