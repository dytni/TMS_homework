package Leson_4;

import java.util.Random;

/*Создайте двумерный массив. Выведите на консоль диагонали массива.*/
public class Task5 {
     public static void main(String[] args) {
          Random random = new Random();
          int[][] arr = new int[3][3];
          for (int i = 0; i < 3; i++) {
               for (int j = 0; j < 3; j++) {
                    arr[i][j] = random.nextInt(11);
               }
          }
          System.out.println("first diagonal");
          for(int i=0;i<3;i++){
               System.out.print(" "+  arr[i][i]);
          }
          System.out.println();
          System.out.println("second diagonal");
          for(int i=0;i<3;i++){
               System.out.print(" "+  arr[2-i][i]);
          }

     }
}

