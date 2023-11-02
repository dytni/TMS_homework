package Lesson_4;

import java.util.Arrays;
import java.util.Random;

/*Создайте двумерный массив целых чисел. Отсортируйте элементы в строках двумерного массива по возрастанию.
 */
public class Task6 {
     public static void main(String[] args) {
          Random random = new Random();
          int[][] arr = new int[3][3];
          for (int i = 0; i < 3; i++) {
               for (int j = 0; j < 3; j++) {
                    arr[i][j] = random.nextInt(11);
               }
          }
          for (int i = 0; i < 3; i++) {
               Arrays.sort(arr[i]);
          }
          for (int i = 0; i < 3; i++) {
               for (int j = 0; j < 3; j++) {
                    System.out.print(" " + arr[i][j]);
               }
               System.out.println();
          }
     }
}
