package Leson_2;

import java.util.Scanner;
/*. По введенному номеру определить цвет радуги (1 –
красный, 4 – зеленый и т. д.).*/
public class Task5 {
    public static void main(String[] args) {
        String[] arr = new String[]{"красный", "оранжевый", "желтый", "зеленый", "голубой", "синий", "фиолетовый"};
        System.out.println("Enter number");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println(arr[number - 1]);
    }
}
