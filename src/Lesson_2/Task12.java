package Lesson_2;

public class Task12 {/*1. Выведите на экран первые 11 членов последовательности
Фибоначчи.*/

    public static void main(String[] args) {
        int elementK = 1;
        int elementKNext = 1;
        System.out.println(elementK);
        System.out.println(elementKNext);
        for (int i = 2, temp; i < 12; i++) {
            temp = elementK + elementKNext;
            elementK = elementKNext;
            elementKNext = temp;
            System.out.println(temp);
        }
    }
}
