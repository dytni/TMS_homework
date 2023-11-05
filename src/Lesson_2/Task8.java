package Lesson_2;

import java.util.Scanner;

public class Task8 {/*Напишите программу, где пользователь вводит любое целое
положительное число. А программа суммирует все числа от 1 до
введенного  пользователем числа. Для ввода числа воспользуйтесь
классом Scanner.*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Enter number");
        int sum = 0;
        number = input.nextInt();
        for (int i = 1; i < number; i++) {
            sum = sum + i;
        }
    }
}
