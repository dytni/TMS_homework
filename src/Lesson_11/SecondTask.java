package Lesson_11;
//2. Улучшить предыдущее задание. А именно:
//        Валидные номера документов следует записать в один файл-отчет.
//        Невалидные номера документов следует записать в другой файл-отчет, но после номеров документов следует добавить информацию о том, почему этот документ невалиден.

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class SecondTask {
    public static void fileCheck(String path) {
        if (path == null) throw new IllegalArgumentException("error path");
        FileInputStream docFile = null;
        FileWriter docFileCorrect = null;
        FileWriter docFileUncorrected = null;
        try {
            docFile = new FileInputStream(path);
            docFileCorrect = new FileWriter("src/Lesson_11/CorrectedDoc.txt");
            docFileUncorrected = new FileWriter("src/Lesson_11/UncorrectedDoc.txt");
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
                StringBuilder errorMessage= new StringBuilder();
                boolean errorFlag = false;
                String line = stringBuilder.substring(0, stringBuilder.indexOf("\r"));
                if (!line.matches("[a-zA-Z0-9]+")) {
                    errorMessage.append(" uncorrected symbols in doc name\n");
                    errorFlag = true;
                }
                if (!line.startsWith("docnum") && !line.startsWith("contract")) {
                    errorMessage.append(" uncorrected classification of doc name\n");
                    errorFlag = true;
                }
                if (stringBuilder.substring(0,stringBuilder.indexOf("\r")).length() != 15) {
                    errorMessage.append(" uncorrected size of doc name\n");
                    errorFlag = true;
                }
                stringBuilder.delete(0, stringBuilder.indexOf("\n") + 1);
                System.out.println(line);
                counter -= 1;
                if (errorFlag) {
                    System.out.println("\u001b[31m" + " Uncorrected document number" + "\u001b[0m");
                    System.out.println();
                    docFileUncorrected.write(line + "\n" + errorMessage + "\n");
                } else {
                    docFileCorrect.write(line + "\n");
                }

            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        } finally {
            try {
                if (docFileCorrect != null){
                    docFileCorrect.close();
                }
                if (docFileUncorrected != null){
                    docFileUncorrected.close();
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