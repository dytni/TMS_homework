package Lesson_14;
//1. Создать коллекцию класса ArrayList наполнить ее элементами рандомными элементами типа Integer.
//        С помощью Stream'ов:
//        - Удалить дубликаты
//        - Вывести все четные элементы в диапазоне от 7 до 17 (включительно)
//        - Каждый элемент умножить на 2
//        - Отсортировать и вывести на экран первых 4 элемента
//        - Вывести количество элементов в стриме
//        - Вывести среднее арифметическое всех чисел в стриме

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            arrayList.add(random.nextInt(100));
        }
        Stream<Integer> stream = arrayList.stream();
        arrayList = (ArrayList<Integer>) stream.distinct().collect(Collectors.toList());
        System.out.println("Filtered elements:");
        arrayList.stream().filter(x -> x > 7 && x < 17 && x % 2 == 0).forEach(System.out::println);
        System.out.println();
        arrayList = (ArrayList<Integer>) arrayList.stream().map(x -> x *= 2).collect(Collectors.toList());
        arrayList = (ArrayList<Integer>) arrayList.stream().sorted().collect(Collectors.toList());
        System.out.println("4 first elements * 2");
        arrayList.stream().limit(4).forEach(System.out::println);
        System.out.println("Amount elements in stream " + arrayList.stream().count());
        System.out.println("Average " + arrayList.stream().mapToInt(Integer::intValue).average().getAsDouble());
    }
}
