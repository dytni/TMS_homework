package course.clients.contlor;

import course.clients.User;
import course.clients.contlor.sql.UsersTable;

import java.util.Scanner;

public class AddUser {
    public static void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter user id");
        int id = scanner.nextInt();
        System.out.println("Enter name");
        String name = scanner.next();
        System.out.println("Enter surname");
        String surname = scanner.next();
        System.out.println("Enter passport id");
        String passportId = scanner.next();
        User user = new User(id, name, surname, passportId);
        UsersTable.inset(user);
        AddBankAccount.add(id);
    }
}
