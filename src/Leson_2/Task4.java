package Leson_2;

import java.util.Scanner;

public class Task4 {
    /*Для введенного числа t (температура на улице) вывести
Если t>–5, то вывести «Тепло».
Если –5>= t > –20, то вывести «Нормально».
Если –20>= t, то вывести «Холодно».*/
    public static void main(String[] args) {
        int temperature;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature");
        temperature = input.nextInt();
        if (temperature > -5) {
            System.out.println("worm");
        } else if (temperature <= -20) {
            System.out.println("cold");
        } else  {
            System.out.println("norm");
        }
    }
}
