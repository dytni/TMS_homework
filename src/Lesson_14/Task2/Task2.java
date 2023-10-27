package Lesson_14.Task2;
//Создать коллекцию класса ArrayList со значениями имен всех студентов в группе
//        С помощью Stream'ов:
//        - Вернуть количество количества людей с вашим именем (вне зависимости от верхнего/нижнего регистра букв)
//        - Выбрать все имена, начинающиеся на "а" (вне зависимости от верхнего/нижнего регистра букв)
//        - Отсортировать и вернуть первый элемент коллекции или Empty, если коллекция пуста

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {
    public static void ArrayListCheck(ArrayList<String> arrayList) {
        Stream<String> stream = arrayList.stream();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.next();
        System.out.println("Amount people with same name: " + stream.map(String::toLowerCase).filter(x -> x.equals(name.toLowerCase())).count());
        stream = arrayList.stream();
        stream.map(String::toLowerCase).filter(x -> x.startsWith("a")).forEach(System.out::println);
        arrayList = (ArrayList<String>) arrayList.stream().sorted().collect(Collectors.toList());
        if (arrayList.isEmpty()) {
            System.out.println("Empty");
        } else {
            System.out.println("First element is " + arrayList.get(0));
        }
    }
}
