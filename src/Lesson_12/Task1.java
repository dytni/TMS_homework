package Lesson_12;

//Основное задание
//        1. Вернемся к домашнему заданию занятия номер 11 и модифицируем его.
//        Программа должна получать имена файлов с номерами документов с консоли: каждая новая строка - это путь к файлу и имя файла.
//        Для завершения ввода списка файлов следует ввести 0.
//        После получения списка документов программа должна обработать каждый документ: вычитать из файла номера документов и провалидировать их.
//        В конце работы создать один файл отчет с выходной информаций: номер документа - комментарий(валиден или не валиден и по какой причине).
//        Пусть каждый файл содержит каждый номер документа с новой строки и в строке никакой другой информации, только номер документа.
//        Валидный номер документа должен иметь длину 15 символов и начинаться с последовательности docnum(далее любая последовательность букв/цифр) или contract(далее любая последовательность букв/цифр).
//        Учесть, что номера документов могут повторяться в пределах одного файла и так же разные документы могут содержать одни и те же номера документов.
//        Если номера документов повторяются, то повторные номера документов не проверять, не валидировать.
//        Немного технических деталей
//        1) Считать с консоли список документов: раз список - то это коллекции типа List, никаких других условий нет - значит все имена файлов с консоли сохраняем в структуру данных ArrayList.
//        2) Номера документов могут повторяться, но повторные документы обрабатывать не надо и валидировать не надо, т.е. по сути дубликаты нам не нужны - значит, надо считать номера документов из файлов и все номера документов сохранять в коллекцию типа Set. Других условий нет, значит можно использовать HashSet.
//        3) В конце должна быть структура номер документа - комментарий - т.е. эта структура типа ключ-значений, значит это коллекция типа Map. Других условий нет - значит, можно использовать HashMap. Создать такую структуру и уже потом сделать цикл по этой структуре и записать всю информацию из этой мапы в файл-отчет.

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Task1 {
    public static void DocInput() {
        System.out.println("Enter file paths if you want stop Enter 0");
        Scanner scanner = new Scanner(System.in);
        List<String> filelist = new ArrayList<>();
        String input = "null";
        while (!input.equals("0")) {
            input = scanner.next();
            filelist.add(input);
        }
        filelist.remove("0");
        for (String path : filelist) {
            fileCheck(path);
        }
    }

    private static void fileCheck(String path) {
        if (path == null) throw new IllegalArgumentException("error path");
        FileInputStream docFile = null;
        FileWriter docFileReport = null;
        HashSet<String> hashSet = new HashSet<>();
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            docFile = new FileInputStream(path);
            docFileReport = new FileWriter("src/Lesson_12/ReportDoc.txt", true);
            docFileReport.write("file " + path + "\n");
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
                StringBuilder errorMessage = new StringBuilder();
                boolean errorFlag = false;
                String line = stringBuilder.substring(0, stringBuilder.indexOf("\r"));
                if (!hashSet.contains(line)) {
                    hashSet.add(line);
                    if (!line.matches("[a-zA-Z0-9]+")) {
                        errorMessage.append(" uncorrected symbols in doc name\t");
                        errorFlag = true;
                    }
                    if (!line.startsWith("docnum") && !line.startsWith("contract")) {
                        errorMessage.append(" uncorrected classification of doc name\t");
                        errorFlag = true;
                    }
                    if (stringBuilder.substring(0, stringBuilder.indexOf("\r")).length() != 15) {
                        errorMessage.append(" uncorrected size of doc name\t");
                        errorFlag = true;
                    }
                    if (errorFlag) {
                        System.out.println();
                        System.out.println("\u001b[31m" + " Uncorrected document number" + "\u001b[0m");
                        errorMessage.setCharAt(0,'#');
                    }
                    hashMap.put(line, errorMessage +"\n");
                }
                stringBuilder.delete(0, stringBuilder.indexOf("\n") + 1);
                System.out.println(line);
                counter -= 1;
            }
            for(String fileNumber: hashSet){
                docFileReport.write(fileNumber +"\t"+hashMap.get(fileNumber));
            }
            docFileReport.write("\n\n\n");
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        } finally {
            try {
                if (docFileReport != null) {
                    docFileReport.close();
                }
                if (docFile != null) {
                    docFile.close();
                }
            } catch (IOException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }

}
