package Leson_4;

import java.util.Random;
import java.util.Scanner;

/*Создайте двумерный массив. Выведите на консоль диагонали массива.*/
public class Task5 {
     public static void main(String[] args) {
          Random random = new Random();
          Scanner scanner =  new Scanner(System.in);
          System.out.println("Enter size of matrix");
          int size = scanner.nextInt();
          int[][] arr = new int[size][size];
          for (int i = 0; i < size; i++) {
               for (int j = 0; j < size; j++) {
                    arr[i][j] = random.nextInt(11);
               }
          }
          System.out.println("first diagonal");
          for(int i=0;i<size;i++){
               System.out.print(" "+  arr[i][i]);
          }
          System.out.println();
          System.out.println("second diagonal");
          for(int i=0;i<size;i++){
               System.out.print(" "+  arr[size-1-i][i]);
          }

     }
}

