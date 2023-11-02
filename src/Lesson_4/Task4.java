package Lesson_4;

import java.util.Random;

/* Создайте двумерный массив целых чисел. Выведите на консоль сумму всех элементов массива*/
public class Task4 {
     public static void main(String[] args) {
         Random random=new Random();
         int [][]arr=new int[3][3];
         int sum=0;
         for (int i = 0; i < 3; i++) {
             for (int j = 0; j < 3; j++) {
                 arr[i][j] = random.nextInt(11);
                 System.out.print(" " + arr[i][j]);
                 sum=sum+arr[i][j];
             }
             System.out.println();
         }
         System.out.println("Sum = "+sum);
     }
}
