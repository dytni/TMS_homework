package Leson_2;

import java.util.Scanner;

public class Task3 {/*Напишите программу, которая будет принимать на вход
число и на выход будет выводить сообщение четное число или нет.
Для определения четности числа используйте операцию получения
остатка от деления - операция выглядит так: '% 2'*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Enter number");
        number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
}
