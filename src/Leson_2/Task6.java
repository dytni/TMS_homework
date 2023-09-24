package Leson_2;
/*1. При помощи цикла for вывести на экран нечетные числа от 1 до
99.  При решении используйте операцию инкремента (++).*/
public class Task6 {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i = i + 2) {
            System.out.println(i);
        }
    }
}