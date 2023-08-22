package Leson_3;
/*Создайте и заполните массив случайным числами и выведете
максимальное, минимальное и среднее значение. Для генерации случайного
числа используйте метод Math.random(). Пусть будет возможность создавать
массив произвольного размера. Пусть размер массива вводится с консоли*/
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int size;
        Scanner input = new Scanner(System.in);
        size = input.nextInt();
        double []mas= new double[size];
        double randomNum;
        for (int i = 0; i < 15; i++) {
            randomNum = Math.random();
            mas[i] = randomNum;
            System.out.println(mas[i]);
        }
    }
}
