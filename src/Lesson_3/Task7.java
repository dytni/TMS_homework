package Lesson_3;

import java.util.Arrays;

/*Создайте массив строк. Заполните его произвольными именами
людей. Отсортируйте массив. Результат выведите на консоль.
*/
public class Task7 {
     public static void main(String[] args) {
          String []arr=new String[]{"Dan","Mag","Angela","Kai","Ben"};
          Arrays.sort(arr);
          for(String i:arr){
               System.out.println(i);
          }
     }
}
