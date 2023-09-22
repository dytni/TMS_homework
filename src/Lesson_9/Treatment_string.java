package Lesson_9;


public class Treatment_string {
    static void show_2_blocks_with_numbers(String string) {
        if (string == null) throw new IllegalArgumentException("Error argument");
        String[] string1 = string.split("-");
        System.out.println(string1[0] + string1[2]);
    }

    static void show_string_with_blur(String string) {
        if (string == null) throw new IllegalArgumentException("Error argument");
        StringBuffer stringBuffer = new StringBuffer(string);
        System.out.println(stringBuffer.replace(5, 8, "***").replace(14, 17, "***"));

    }

    static void show_letters_toLower_case(String string) {
        if (string == null) throw new IllegalArgumentException("Error argument");
        String[] string1 = string.split("-");
        System.out.print(string1[1].toLowerCase() + "/" + string1[3].toLowerCase() + "/");
        System.out.println(string1[4].toLowerCase().charAt(1) + "/" + string1[4].toLowerCase().charAt(3));
    }

    static void show_letters_toUpper_case(String string) {
        if (string == null) throw new IllegalArgumentException("Error argument");
        String[] string1 = string.split("-");
        System.out.print(string1[1].toUpperCase() + "/" + string1[3].toUpperCase() + "/");
        StringBuilder stringBuilder = new StringBuilder(string1[4].toUpperCase());
        System.out.println(stringBuilder.charAt(1) + "/" + stringBuilder.charAt(3));
    }

    static void is_string_contain_abc(String string) {
        if (string == null) throw new IllegalArgumentException("Error argument");
        if (string.contains("abc") || string.contains("ABC")) System.out.println("Contain");
        else System.out.println("Does not contain");
    }

    static void is_string_starts_from_555(String string) {
        if (string == null) throw new IllegalArgumentException("Error argument");
        if (string.startsWith("555")) System.out.println("Yes");
        else System.out.println("No");
    }

    static void is_string_ends_with_1a2b(String string) {
        if (string == null) throw new IllegalArgumentException("Error argument");
        if (string.endsWith("1a2b")) System.out.println("Yes");
        else System.out.println("No");
    }

    static void search_max_min(String string) {
        if (string == null) throw new IllegalArgumentException("Error argument");
        String[] string1 = string.split(" ");
        int max = string1[0].length();
        int min = string1[0].length();
        for (String element : string1) {
            if (element.length() > max) max = element.length();
            if (element.length() < min) min = element.length();
        }
        for (String element : string1) {
            if (element.length() == max) System.out.println("Maximal length: " + element);
            else if (element.length() == min) System.out.println("Minimal length: " + element);
        }
    }
}
