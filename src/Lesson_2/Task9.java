package Lesson_2;
/*Необходимо, чтоб программа выводила на экран вот такую
последовательность: 7 14 21 28 35 42 49 56 63 70 77 84 91 98. В решении
используйте цикл while.
*/
public class Task9 {
    public static void main(String[] args) {
        int element = 7;
        while (element < 99) {
            System.out.println(element);
            element = element + 7;
        }
    }
}