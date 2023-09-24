package Leson_4;

import java.util.Random;

/*Умножение двух матриц. Создайте два массива целых чисел размером 3х3 (две матрицы). Напишите программу для умножения двух матриц*/
public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];
        int[][] result = new int[3][3];
        System.out.println("First");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr1[i][j] = random.nextInt(6);
                System.out.print(" " + arr1[i][j]);
                arr2[i][j] = random.nextInt(6);
            }
            System.out.println();
        }
        System.out.println("Second");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + arr2[i][j]);
            }
            System.out.println();
        }
        System.out.println("Result:");
        int sum = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {

                        sum = sum + arr1[j][k] * arr2[k][i];

                }
                result[i][j] = sum;
                sum = 0;
            }

        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + result[i][j]);
            }
            System.out.println();
        }

    }
}
