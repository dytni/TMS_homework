package Lesson_17.Task2;
//Программа на вход получает путь к папке (задается через консоль).
//        В заданной папке находятся текстовые файлы (формат тхт).
//        Каждый файл содержит произвольный текст. В этом тексте может быть номер документа(один или несколько), емейл и номер телефона.
//        номер документа в формате: xxxx-yyy-xxxx-yyy-xyxy, где x - это любая цифра, а y - это любая буква русского или латинского алфавита номер телефона в формате: +(ХХ)ХХХХХХХ
//        Документ может содержать не всю информацию, т.е. например, может не содержать номер телефона, или другое поле.
//        Необходимо извлечь информацию из N текстовых документов. Число документов для обработки N задается с консоли.
//Если в папке содержится меньше документов, чем заданное число - следует обрабатывать все документы.
//        Извлеченную информацию необходимо сохранить в следующую структуру данных: Map<String, Document>, где ключ типа String - это имя документа без расширения, значение типа Document - объект кастомного класса, поля которого содержат извлеченную из текстового документа информацию
//        Учесть вывод сообщений на случаи если,
//        - на вход передан путь к папке, в которой нет файлов
//        - все файлы имеют неподходящий формат (следует обрабатывать только тхт файлы)
//        - так же сообщения на случай других исключительных ситуаций
//        В конце работы программы следует вывести сообщение о том, сколько документов обработано и сколько было документов невалидного формата.

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter path to package");
        String path = scanner.next();
        File dir = new File(path);
        File[] files = dir.listFiles();
        File file;
        StringBuilder stringBuilder = new StringBuilder();
        FileReader fileReader;
        Pattern patternDocumentNumber = Pattern.compile("[0-9]{4}-[а-яА-Яa-zA-Z]{3}-[0-9]{4}-[а-яА-Яa-zA-Z]{3}-[0-9][а-яА-Яa-zA-Z][0-9][а-яА-Яa-zA-Z]");
        Pattern patternPhoneNumber = Pattern.compile("[+]375([0-9]{2})[0-9]{7}");
        Pattern patternEmail = Pattern.compile("\s[a-zA-Z0-9_]{1,12}@[a-zA-Z]+.[a-zA-Z]+");
        Map<String, Document> infoFromFile = new HashMap<>();
        System.out.println("Enter amount of files");
        int fileAmount = scanner.nextInt();
        try {
            if (files == null || files.length == 0) {
                throw new EmptyPackageException();
            }
            if(fileAmount > files.length ){
                fileAmount=files.length;
            }
            for (int i = 0; i < fileAmount; i++) {
                file = files[i];
                System.out.println(file.getName());
                fileReader = new FileReader(file);
                int symbol;
                while ((symbol = fileReader.read()) != -1) {
                    stringBuilder.append((char) symbol);
                }
                String fileInfo = stringBuilder.toString();
                stringBuilder.delete(0, stringBuilder.length());
                Matcher matcherDocumentNumber = patternDocumentNumber.matcher(fileInfo);
                Matcher matcherPhoneNumber = patternPhoneNumber.matcher(fileInfo);
                Matcher matcherEmail = patternEmail.matcher(fileInfo);
                System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - ");
                Document document = new Document();
                while (matcherDocumentNumber.find()) {
                    document.addDocumentNumber(matcherDocumentNumber.group());
                }
                if (matcherPhoneNumber.find()) {
                    document.addPhoneNumber(matcherPhoneNumber.group());
                }
                if (matcherEmail.find()) {
                    document.addEmail(matcherEmail.group().trim());
                }
                char[] idFromDocNum = new char[4];
                stringBuilder.append(document.ValuesForID());
                stringBuilder.getChars(0, 3, idFromDocNum, 0);
                stringBuilder.delete(0, stringBuilder.length());
                document.id = idFromDocNum[0] + idFromDocNum[1] + idFromDocNum[2] + idFromDocNum[3];
                infoFromFile.put(file.getName(), document);
            }
        } catch (EmptyPackageException | IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
