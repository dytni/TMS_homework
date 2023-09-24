package Leson_3;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random ran = new Random();
        int[] mas = new int[15];
        for (int i = 0; i < 15; i++) {
            mas[i] = ran.nextInt(51);
            System.out.println(mas[i]);
        }
        System.out.println("Enter key:");
        int key = in.nextInt();
        boolean isExist = false;
        int[] mas1 = new int[14];
        for (int i = 0; i < 15; i++) {
            if (mas[i] == key) {
                isExist = true;
                if (i == 0) {
                    System.arraycopy(mas, 1, mas1, 0, 14);
                } else {
                    System.arraycopy(mas, 0, mas1, 0, i);
                    System.arraycopy(mas, i + 1, mas1, i, mas.length - i - 1);
                }
            }
        }
        if (isExist) {
            for (int b : mas1) {
                System.out.println(b);
            }
        } else {
            System.out.println("Element don't find");
        }
    }
}
