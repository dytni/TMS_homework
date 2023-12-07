package course.clients.contlor;

import course.clients.BankAccount;
import course.clients.BankOperation;
import course.clients.contlor.sql.OperationHistoryTable;
import course.clients.enums.OperationStatus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AddBankOperation {
    public static void add(BankAccount in, BankAccount out, float payment, OperationStatus status) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter operation id");
        int id = scanner.nextInt();
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatDateTime = now.format(formatter);
        BankOperation bankOperation = new BankOperation(id, in.getAccountNumber(), out.getAccountNumber(), payment, formatDateTime, status);
        OperationHistoryTable.inset(bankOperation);

    }
}
