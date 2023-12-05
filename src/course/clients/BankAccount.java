package course.clients;

import course.clients.enums.AccountTypes;

public class BankAccount {
    int bankAccountId;
    int userId;
    String accountNumber;
    String openingDate;
    AccountTypes accountTypes;
    float balance;
    String currency;

    public int getBankAccountId() {
        return bankAccountId;
    }

    public int getUserId() {
        return userId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOpeningDate() {
        return openingDate;
    }

    public AccountTypes getAccountTypes() {
        return accountTypes;
    }

    public float getBalance() {
        return balance;
    }

    public String getCurrency() {
        return currency;
    }

    public BankAccount(int bankAccountId, int userId, String accountNumber, String openingDate, AccountTypes accountTypes, float balance, String currency) {
        this.bankAccountId = bankAccountId;
        this.userId = userId;
        this.accountNumber = accountNumber;
        this.openingDate = openingDate;
        this.accountTypes = accountTypes;
        this.balance = balance;
        this.currency = currency;
    }
}
