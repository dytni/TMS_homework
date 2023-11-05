package Leson_2;

public class Task14 {/*Напишите программу, которая выводит на консоль таблицу
    умножения.*/

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("|%d*%d=%d\t", i, j, i * j);
                //System.out.print("| " +i+"*"+j+"="+i*j );
            }
            System.out.println();
        }
    }
}
