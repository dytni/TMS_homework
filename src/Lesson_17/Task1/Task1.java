package Lesson_17.Task1;
//Написать программу для проверки на валидность введенного ip адреса.
//        Пусть ip адрес задается с консоли.
//        Программа должна проверять валидность введенного ip адреса с
//        помощью регулярного выражения и выводить результат проверки на
//        экран.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
     public static void IpCheck(String Ip) {
          String regexp = "(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
          Pattern pattern = Pattern.compile(regexp);
          Matcher matcher = pattern.matcher(Ip);
          System.out.println(matcher.matches());

     }
}
