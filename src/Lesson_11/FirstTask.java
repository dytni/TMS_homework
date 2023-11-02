package Lesson_11;

import java.io.FileInputStream;
import java.io.IOException;

//1. Допустим есть txt файл с номерами документов. Номером документа является строка, состоящая из букв и цифр(без служебных символов).
//        Пусть этот файл содержит каждый номер документа с новой строки и в строке никакой другой информации, только номер документа.
//        Валидный номер документа должен иметь длину 15 символов и начинаться с последовательности docnum(далее любая последовательность букв/цифр) или contract(далее любая последовательность букв/цифр).
//        Написать программу для чтения информации из входного файла - путь к входному файлу должен задаваться через консоль.
//        Программа должна проверять номера документов на валидность.

public class FirstTask {


    public static void fileCheck(String path) {
        if (path == null) throw new IllegalArgumentException("error path");
        FileInputStream docFile = null;
        try {
            docFile = new FileInputStream(path);
            int index;
            int counter = 1;
            StringBuilder stringBuilder = new StringBuilder();
            while ((index = docFile.read()) != -1) {
                if ((char) index == '\r') {
                    counter += 1;
                }
                stringBuilder.append((char) index);
            }
            stringBuilder.append('\r');
            while (counter != 0) {
                String line = stringBuilder.substring(0, stringBuilder.indexOf("\r"));
                if (line.matches("[a-zA-Z0-9]+")) {
                    char[] buffer = new char[6];
                    stringBuilder.getChars(0, 6, buffer, 0);
                    if (!line.startsWith("docnum") && !line.startsWith("contract")) {
                        System.out.println("\u001b[31m" + "Uncorrected document number" + "\u001b[0m");
                        counter -= 1;
                        stringBuilder.delete(0, stringBuilder.indexOf("\n") + 1);
                        continue;
                    }
                    line = stringBuilder.substring(0, 15);
                    stringBuilder.delete(0, 15);
                    if (stringBuilder.charAt(0) != '\r') {
                        System.out.println("\u001b[31m" + "Uncorrected document number" + "\u001b[0m");
                        counter -= 1;
                        stringBuilder.delete(0, stringBuilder.indexOf("\n") + 1);
                        continue;
                    }
                    stringBuilder.delete(0, 2);
                    System.out.println(line);
                    counter -= 1;
                } else {
                    System.out.println("\u001b[31m" + "Uncorrected document number" + "\u001b[0m");
                    counter -= 1;
                    stringBuilder.delete(0, stringBuilder.indexOf("\n") + 1);
                }
            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        } finally {
            try {
                if (docFile != null) {
                    docFile.close();
                }
            } catch (IOException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }

}

