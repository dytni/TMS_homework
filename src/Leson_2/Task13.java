package Leson_2;

import java.util.Scanner;

public class Task13 {/*За каждый месяц банк начисляет к сумме вклада 7% от суммы.
Напишите программу, в которую пользователь вводит сумму вклада и
количество месяцев. А банк вычисляет конечную сумму вклада с учетом
начисления процентов за каждый месяц. Для вычисления суммы с
учетом процентов используйте цикл for. Пусть сумма вклада будет
представлять тип float*/
     public static void main(String[] args) {
         Scanner input= new Scanner(System.in);
         System.out.println("Enter sum");
         float sum= input.nextFloat();
         System.out.println("Enter amount of month");
         int month = input.nextInt();
         for(int i=0;i<month;i++){
             sum=sum+7*sum/100;
         }
         System.out.println("Your balance:" + sum);
     }
}
