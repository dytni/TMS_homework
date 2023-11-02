package Lesson_3;
/*Создайте и заполните массив случайным числами и выведете
максимальное, минимальное и среднее значение. Для генерации случайного
числа используйте метод Math.random(). Пусть будет возможность создавать
массив произвольного размера. Пусть размер массива вводится с консоли*/
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int size;
        double max;
        double min;
        double average;
        double sum = 0;
        System.out.println("Enter size of array: ");
        Scanner input = new Scanner(System.in);
        size = input.nextInt();
        double[] mas = new double[size];
        for (int i = 0; i < size; i++) {
            mas[i] = Math.random();
            System.out.println(mas[i]);
        }
        min = mas[0];
        max = mas[0];
        for (double num : mas) {
            sum = sum + num;
            if (num > max) max = num;
            if (num < min) min = num;
        }
        average = sum / size;
        System.out.println("Minimum = " + min + " Maximum = " + max + " Average = " + average);
    }
}
