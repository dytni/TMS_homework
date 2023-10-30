package Lesson_14.Task1;

import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
         System.out.println("Enter ip");
         Scanner scanner = new Scanner(System.in);
         String ip = scanner.next();
         Task1.IpCheck(ip);
     }
}
