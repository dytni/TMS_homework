package Lesson_9;

/*1. Написать программу со следующим функционалом:
На вход передать строку (будем считать, что это номер документа).
Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x — это число, а y — это буква.
- Вывести на экран в одну строку два первых блока по 4 цифры.
- Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *).
- Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре.
- Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью класса StringBuilder).
- Проверить содержит ли номер документа последовательность abc и вывести сообщение содержит или нет(причем, abc и ABC считается одинаковой последовательностью).
- Проверить начинается ли номер документа с последовательности 555.
- Проверить заканчивается ли номер документа на последовательность 1a2b.
Все эти методы реализовать в отдельном классе в статических методах,
которые на вход (входным параметром) будут принимать вводимую на вход
программы строку.


Дополнительное задание
2. Дана строка произвольной длины с произвольными словами.
Найти самое короткое слово в строке и вывести его на экран.
Найти самое длинное слово в строке и вывести его на экран.
Если таких слов несколько, то вывести последнее из них.
3. Дана строка произвольной длины с произвольными словами.
Найти слово, в котором число различных символов минимально. Слово может содержать буквы и цифры. Если таких слов несколько, найти первое из них. Например, в строке "fffff ab f 1234 jkjk" найденное слово должно быть "fffff".
4. Дана строка произвольной длины с произвольными словами.
Написать программу для проверки является ли любое выбранное слово в строке палиндромом.
Например, есть строка, вводится число 3, значит необходимо проверить является ли 3-е слово в этой строке палиндромом.
Предусмотреть предупреждающие сообщения на случаи ошибочных ситуаций: например, в строке 5 слов, а на вход программе передали число 500 и т. п. ситуации.
5. Дана произвольная строка.
Вывести на консоль новую строку, которой задублирована каждая буква из начальной строки. Например, "Hello" -> "HHeelllloo".
*/
public class Task1 {
    public static void main(String[] args) {
        String string = "1145-AvF-8991-iyP-2K5w";
        String string1 = "5554-ABC-8991-iyP-1a2b";
        TreatmentString.showTwoBlocksWithNumbers(string);
        TreatmentString.showStringWithBlur(string);
        TreatmentString.showLettersToLowerCase(string);
        TreatmentString.showLettersToUpperCase(string);
        TreatmentString.isStringContainAbc(string);
        TreatmentString.isStringContainAbc(string1);
        TreatmentString.isStringStartsFrom555(string);
        TreatmentString.isStringStartsFrom555(string1);
        TreatmentString.isStringEndsWith1a2b(string);
        TreatmentString.isStringEndsWith1a2b(string1);
        String string2 = "Привет меня зовут коля, я учусь в бгуире мне восемнадцать лет и я устал делать эти таски, кстати я их делаю вместо лекции по ТВИМСУ";
        TreatmentString.searchMaxMin(string2);
        String string3 = "affaff ab f 1234 jkjk";
        TreatmentString.searchSimpleWord(string3);
        int index = 0;
        TreatmentString.checkPalindrome(index, string3);
        TreatmentString.charDuplication(string2);
    }
}