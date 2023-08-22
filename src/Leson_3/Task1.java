package Leson_3;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random ran = new Random();
        int max = 50;
        int min = 0;
        int range = max - min + 1;

        int[] mas = new int[15];
        for (int i = 0; i < 15; i++) {
            int a = ran.nextInt(range) + min;
            mas[i] = a;
            System.out.println(mas[i]);
        }
        System.out.println("Enter key:");
        int key = in.nextInt();
        boolean a = false;
        int[] mas1 = new int[14];
        for (int i = 0; i < 15; i++) {
            if (mas[i] == key) {
                a = true;

                if (i == 0) {
                    System.arraycopy(mas, 1, mas1, 0, 14);
                } else {
                    System.arraycopy(mas, 0, mas1, 0, i);
                    System.arraycopy(mas, i + 1, mas1, i, mas.length - i - 1);
                }
            }

        }
        if(a){
            for (int b : mas1) {
                System.out.println(b);
            }}
        else{
            System.out.println("Element dont find");
        }
    }
}
