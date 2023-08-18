package Leson_2;

import java.util.Scanner;

public class Task2 {
    /*Написать программу для вывода названия поры года по
    номеру месяца. При решении используйте оператор if-else-if.*/
    public static void main(String[] args) {
        int key;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of month");
        key = input.nextInt();
        if (key == 1) {
            System.out.println("January");
        } else if (key == 2) {
            System.out.println("February");
        } else if (key == 3) {
            System.out.println("March");
        } else if (key == 4) {
            System.out.println("April");
        } else if (key == 5) {
            System.out.println("May");
        } else if (key == 6) {
            System.out.println("June");
        } else if (key == 7) {
            System.out.println("July");
        } else if (key == 8) {
            System.out.println("August");
        } else if (key == 9) {
            System.out.println("September");
        } else if (key == 10) {
            System.out.println("October");
        } else if (key == 11) {
            System.out.println("November");
        } else if (key == 12) {
            System.out.println("December");
        }
    }
}
