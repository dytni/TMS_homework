package course.clients.contlor;

import course.clients.BankAccount;
import course.clients.enums.AccountTypes;
import course.clients.contlor.sql.BankAccountsTable;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AddBankAccount {
    public static void add(int userid) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter bank id");
        int bankId = scanner.nextInt();
        System.out.println("Enter account number");
        String bankAccountNumber = scanner.next();
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Enter 1 - Saving, 2 - Deposit, else - Another");
        int choose = scanner.nextInt();
        AccountTypes accountTypes;
        switch (choose) {
            case 1 -> {
                accountTypes = AccountTypes.SAVING;
            }
            case 2 -> {
                accountTypes = AccountTypes.DEPOSIT;
            }
            default -> {
                accountTypes = AccountTypes.ANOTHER;
            }
        }
        System.out.println("Enter balance");
        float balance = scanner.nextFloat();
        System.out.println("Enter currency");
        String currency = scanner.next();
        String formatDateTime = now.format(formatter);
        BankAccount bankAccount = new BankAccount(bankId, userid, bankAccountNumber, formatDateTime, accountTypes, balance, currency);
        BankAccountsTable.inset(bankAccount);
    }
}
