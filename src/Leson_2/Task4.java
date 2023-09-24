package Leson_2;

import java.util.Scanner;
    /*Для введенного числа t (температура на улице) вывести
Если t>–5, то вывести «Тепло».
Если –5>= t > –20, то вывести «Нормально».
Если –20>= t, то вывести «Холодно».*/
public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature");
        int temperature = input.nextInt();
        if (temperature > -5) {
            System.out.println("worm");
        } else if (temperature <= -20) {
            System.out.println("cold");
        } else  {
            System.out.println("norm");
        }
    }
}
