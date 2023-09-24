package Leson_2;

public class Task12 {/*1. Выведите на экран первые 11 членов последовательности
Фибоначчи.*/
 public static void main(String[] args) {
     int element_k = 1;
     int element_k_next = 1;
     System.out.println(element_k);
     System.out.println(element_k_next);
     for(int i=2, temp;i<12;i++){
         temp=element_k+element_k_next;
         element_k=element_k_next;
         element_k_next=temp;
         System.out.println(temp);
     }
 }
}
