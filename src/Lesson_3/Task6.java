package Lesson_3;

import java.util.Random;

/*Создайте массив и заполните массив. Выведите массив на экран в строку.
Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на
экран на отдельной строке.

*/
public class Task6 {
     public static void main(String[] args) {
          Random random=new Random();
          int size=random.nextInt(12)+1;
          int []arr= new int[size];
          System.out.println("Array:");
          for(int i=0;i<size;i++){
               arr[i]= random.nextInt(51);
               System.out.print(" "+arr[i]);
          }
          System.out.println();
          for(int i=0;i<size;i=i+2){
               arr[i]=0;
          }
          System.out.println("New Array:");
          for(int i:arr){
               System.out.print(" "+i);
          }
     }

}
