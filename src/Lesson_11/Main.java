package Lesson_11;

import java.util.Scanner;

public class Main {
     public static void main(String[] args) throws Exception {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter path to file");
         String path = scanner.next();
         //path = "src//Lesson_11//Documents.txt";
         Task1.fileCheck(path);
     }
}
