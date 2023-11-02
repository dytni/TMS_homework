package Lesson_10;

public class Main {
    public static void main(String[] args) {
        String string = "0504-AmC-8991-iyP-1a2b";
        String password = "1234";
        String login = "dytni";
        String confirmPassword = "1234";
        String confirmPassword1 = "12341";
        Task1.isStringContainAbc(string);
        Task1.isStringEndsWith1a2b(string);
        Task1.isStringStartsFrom555(string);
        System.out.println();
        System.out.println(Task2.password(login,password, confirmPassword));
        System.out.println();
        System.out.println(Task2.password(login,password,confirmPassword1));
        System.out.println();

    }
}
