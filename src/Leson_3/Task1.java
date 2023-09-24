package Leson_3;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random ran = new Random();
        System.out.println("Enter key:");
        int key = in.nextInt();
        int[] mas = new int[15];
        for (int i = 0; i < 15; i++) {
            mas[i] = ran.nextInt(51);
            System.out.println(mas[i]);
            if (mas[i] == key) {
                System.out.println("Key was finded");
                break;
            }
        }
    }
}
