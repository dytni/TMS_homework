package Lesson_13;
//Основное задание
//        1. Написать программу для вывода на консоль названия дня недели по введенной дате.
//        2. Написать программу для вывода на экран дату следующего вторника.
//
//        Дополнительное задание
//        3. Создать обобщенный функциональный интерфейс. Написать класс с одним методом.
//        В этом методе реализуйте логику:
//        - если в консоль введена цифра 1, то: использования интерфейса со строковым типом и передать в метод интерфейса логику реверса строки(вывода строки в обратном порядке).
//        - если в консоль введена цифра 2, то: использования интерфейса с целочисленным типом и передать в метод интерфейса логику нахождения факториала числа.

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int TaskChoose;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of task 1, 2 or 3");
        TaskChoose = scanner.nextInt();
        switch (TaskChoose) {
            case 1 -> {
                System.out.println("Enter day, month and year in format dd-MM-yyyy");
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                String input = scanner.next();
                LocalDate UserDay = LocalDate.parse(input, formatter);
                DayOfWeek dayOfWeek = UserDay.getDayOfWeek();
                System.out.println(dayOfWeek);

            }
            case 2 -> {
                LocalDate date = LocalDate.now();
                LocalDate day = LocalDate.of(2023, 10, 24);
                TemporalAdjuster firstDayOfTuesday = TemporalAdjusters.next(DayOfWeek.TUESDAY);
                LocalDate adjustedDate = date.with(firstDayOfTuesday);
                LocalDate adjustedDay = day.with(firstDayOfTuesday);
                System.out.println(adjustedDate + " " + adjustedDay);
            }
            case 3 -> {
                System.out.println("Enter 1 for reverse string or 2 for factorial of number");
                int input = scanner.nextInt();
                if (input == 1) {
                    Consumer<String> consumer = x -> {
                        StringBuilder reversedStr = new StringBuilder(); // создаем объект StringBuilder для хранения реверсированной строки
                        for (int i = x.length() - 1; i >= 0; i--) { // проходим по строке с конца до начала
                            reversedStr.append(x.charAt(i)); // добавляем каждый символ в начало объекта StringBuilder
                        }
                        System.out.println(reversedStr);
                    };
                    consumer.accept("kola");
                } else if (input == 2) {
                    Consumer<Integer> consumer = x -> {
                        int answer = 1;
                        while (x != 1) {
                            answer = answer * x;
                            x = x - 1;
                        }
                        System.out.println("Factorial = " + answer);
                    };
                    consumer.accept(5);
                }
            }
        }
    }
}

