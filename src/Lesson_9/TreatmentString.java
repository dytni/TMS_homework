package Lesson_9;


import java.util.HashSet;
import java.util.Set;

public class TreatmentString {
    static void showTwoBlocksWithNumbers(String string) {
        if (string == null) {
            throw new IllegalArgumentException("Error argument");
        }
        String[] string1 = string.split("-");
        System.out.println(string1[0] + string1[2]);
    }

    static void showStringWithBlur(String string) {
        if (string == null) {
            throw new IllegalArgumentException("Error argument");
        }
        StringBuffer stringBuffer = new StringBuffer(string);
        System.out.println(stringBuffer.replace(5, 8, "***").replace(14, 17, "***"));

    }

    static void showLettersToLowerCase(String string) {
        if (string == null) {
            throw new IllegalArgumentException("Error argument");
        }
        String[] string1 = string.split("-");
        System.out.print(string1[1].toLowerCase() + "/" + string1[3].toLowerCase() + "/");
        System.out.println(string1[4].toLowerCase().charAt(1) + "/" + string1[4].toLowerCase().charAt(3));
    }

    static void showLettersToUpperCase(String string) {
        if (string == null) {
            throw new IllegalArgumentException("Error argument");
        }
        String[] string1 = string.split("-");
        System.out.print(string1[1].toUpperCase() + "/" + string1[3].toUpperCase() + "/");
        StringBuilder stringBuilder = new StringBuilder(string1[4].toUpperCase());
        System.out.println(stringBuilder.charAt(1) + "/" + stringBuilder.charAt(3));
    }

    static void isStringContainAbc(String string) {
        if (string == null) {
            throw new IllegalArgumentException("Error argument");
        }
        if (string.contains("abc") || string.contains("ABC")) {
            System.out.println("Contain");
        } else {
            System.out.println("Does not contain");
        }
    }

    static void isStringStartsFrom555(String string) {
        if (string == null) {
            throw new IllegalArgumentException("Error argument");
        }
        if (string.startsWith("555")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    static void isStringEndsWith1a2b(String string) {
        if (string == null) {
            throw new IllegalArgumentException("Error argument");
        }
        if (string.endsWith("1a2b")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    static void searchMaxMin(String string) {
        if (string == null) {
            throw new IllegalArgumentException("Error argument");
        }
        String[] string1 = string.split(" ");
        String max = string1[0];
        String min = string1[0];
        for (String element : string1) {
            if (element.length() > max.length()) {
                max = element;
            }
            if (element.length() < min.length()) {
                min = element;
            }
        }
        System.out.println("Maximal length: " + max);
        System.out.println("Minimal length: " + min);
    }

    static void searchSimpleWord(String string) {
        if (string == null) {
            throw new IllegalArgumentException("Error argument");
        }
        String[] strings = string.split(" ");
        char[][] buffer = new char[strings.length][];
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].endsWith(",")) {
                strings[i].getChars(0, strings[i].length() - 1, buffer[i] = new char[strings[i].length() - 1], 0);
            } else {
                strings[i].getChars(0, strings[i].length(), buffer[i] = new char[strings[i].length()], 0);
            }
        }
        char[] minCharWord = null;
        int minCharCount = Integer.MAX_VALUE;
        for (char[] chars : buffer) {
            Set<Character> charSet = new HashSet<>();
            for (char c : chars) {
                charSet.add(c);
            }
            int charCount = charSet.size();
            if (charCount < minCharCount) {
                minCharCount = charCount;
                minCharWord = chars;
            }
        }
        if (minCharWord != null) {
            for (char symbol : minCharWord) {
                System.out.print(symbol);
            }
        }
        System.out.println();
    }

    static void checkPalindrome(int index, String string) {
        if (string == null) {
            throw new IllegalArgumentException("Error argument");
        }
        String[] strings = string.split(" ");
        if (index > strings.length) {
            throw new IllegalArgumentException("Error argument");
        }
        StringBuilder stringBuilder1 = new StringBuilder(strings[index]);
        StringBuilder stringBuilder2 = new StringBuilder(strings[index]);
        int commaIndex = stringBuilder1.lastIndexOf(",");
        if (commaIndex != -1) {
            stringBuilder1.deleteCharAt(commaIndex);
            stringBuilder2.deleteCharAt(commaIndex);
        }
        stringBuilder1.reverse();
        if (stringBuilder1.compareTo(stringBuilder2) == 0) {
            System.out.println("is a palindrome");
        } else
            System.out.println("is not palindrome");
    }

    static void charDuplication(String string) {
        if (string == null) {
            throw new IllegalArgumentException("Error argument");
        }
        String[] strings = string.split(" ");
        char[][] buffer = new char[strings.length][];
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].endsWith(",")) {
                strings[i].getChars(0, strings[i].length() - 1, buffer[i] = new char[strings[i].length() - 1], 0);
            } else {
                strings[i].getChars(0, strings[i].length(), buffer[i] = new char[strings[i].length()], 0);
            }
        }
        for (char[] chars : buffer) {
            for (char aChar : chars) {
                System.out.print(aChar);
                System.out.print(aChar);
            }
            System.out.print("\t");
        }
    }
}

