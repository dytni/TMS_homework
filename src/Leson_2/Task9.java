package Leson_2;

public class Task9 {/*Необходимо, чтоб программа выводила на экран вот такую
последовательность: 7 14 21 28 35 42 49 56 63 70 77 84 91 98. В решении
используйте цикл while.
*/

    public static void main(String[] args) {
        int i = 7;
        while (i < 99) {
            System.out.println(i);
            i = i + 7;
        }
    }
}