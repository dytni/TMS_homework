package Leson_4;

import java.util.Random;
import java.util.Scanner;

/*Создать трехмерный массив из целых чисел. С помощью
циклов "пройти" по всему массиву и увеличить каждый
элемент на заданное число. Пусть число, на которое будет
увеличиваться каждый элемент, задается из консоли*/
public class Task_1 {
     public static void main(String[] args) {
          int[][][] arr = new int[3][3][3];
          int num;
          Random random = new Random();
          Scanner input = new Scanner(System.in);
          for (int i = 0; i < 3; i++) {
               for (int j = 0; j < 3; j++) {
                    for (int k = 0; k < 3; k++) {
                         arr[i][j][k]=random.nextInt(21);
                         System.out.print(" "+arr[i][j][k]);
                    }
                    System.out.println();
               }
               System.out.println();
               System.out.println();
          }
          System.out.println("Enter number: ");
          num=input.nextInt();
          for (int i = 0; i < 3; i++) {
               for (int j = 0; j < 3; j++) {
                    for (int k = 0; k < 3; k++) {
                         arr[i][j][k]=arr[i][j][k]+num;
                         System.out.print(" "+arr[i][j][k]);
                    }
                    System.out.println();
               }
               System.out.println();
               System.out.println();
          }

     }

}
