package Leson_2;

import java.util.Scanner;

public class Task5 {/*. По введенному номеру определить цвет радуги (1 –
красный, 4 – зеленый и т. д.).*/
    public static void main(String[] args) {
        String[] arr = new String[]{"красный", "оранжевый", "желтый", "зеленый", "голубой", "синий", "фиолетовый"};
        int number;
        System.out.println("Enter number");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        System.out.println(arr[number - 1]);
    }
}
