package Leson_10;
//1. Доработать нулевое домашнее задание предыдущего урока.
//        Теперь надо создать свои классы исключений на каждую ситуацию:
//        - Проверить содержит ли номер документа последовательность abc.
//        - Проверить начинается ли номер документа с последовательности 555.
//        - Проверить заканчивается ли номер документа на последовательность
//        1a2b.
//
//        Если номер документа не удовлетворяет условию - то "бросить"
//        исключение.
//
//        В методе класса, в котором будут вызываться эти методы для
//        демонстрации работы, перехватить исключение конструкцией try-catch и
//        в блоке catch вывести сообщение для пользователя (сообщение на
//        консоль).

public class Task1 extends Exception {
    static void is_string_contain_abc(String string) {
        try {
            if (string == null) throw new IllegalArgumentException("Error argument");
            if (string.contains("abc") || string.contains("ABC")) System.out.println("Contain");
            else throw new IllegalArgumentException("Error string");
        }catch (IllegalArgumentException exception){
            System.out.println(exception.getMessage());
        }
    }
}
