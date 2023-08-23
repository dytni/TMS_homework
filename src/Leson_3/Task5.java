package Leson_3;

import java.util.Random;
import java.util.Scanner;

/*Создайте массив из n случайных целых чисел и выведите его на экран.
Размер массива пусть задается с консоли и размер массива может быть больше 5 и
меньше или равно 10. Если n не удовлетворяет условию - выведите сообщение об
этом. Если пользователь ввёл не подходящее число, то программа должна просить
пользователя повторить ввод. Создайте второй массив только из чётных элементов
первого массива, если они там есть, и вывести его на экран.
*/
public class Task5 {
     public static void main(String[] args) {
          int size_of_arr_1;
          int size_of_arr_2=0;
          int[]arr_2;
          int []arr_1;
          Random random = new Random();
          Scanner input = new Scanner(System.in);
          System.out.println("Enter size of array in range from 6 to 10");
          while(true) {
               size_of_arr_1 = input.nextInt();
               if (size_of_arr_1 < 6 || size_of_arr_1 >= 11) {
                    System.out.println("Enter value again");
               }
               else break;
          }
          System.out.println("Array 1: ");
          arr_1=new int[size_of_arr_1];
          for(int i = 0;i<size_of_arr_1;i++){
               arr_1[i]=random.nextInt(51);
               System.out.print(" "+arr_1[i]);
               if(arr_1[i]%2==0){
                    size_of_arr_2++;
               }
          }
          System.out.println();
          if(size_of_arr_2!=0){
               arr_2=new int[size_of_arr_2];
               System.out.println("Array 2: ");
               for(int i=0,j=0;i<size_of_arr_1;i++){
                    if(arr_1[i]%2==0){
                         arr_2[j]=arr_1[i];
                         System.out.print(" "+ arr_2[j]);
                         j++;

                    }
               }
          }else System.out.println("The are no even elements");

     }
}
