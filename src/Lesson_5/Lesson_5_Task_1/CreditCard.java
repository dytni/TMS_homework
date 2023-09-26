package Lesson_5.Lesson_5_Task_1;

public class CreditCard {

    int numberOfCard;
    int balance;

    void addCash(int sum) {
        balance = balance + sum;
    }

    void takeCash(int sum) {
        balance = balance - sum;
    }

    void showInfo() {
        System.out.println("Card number " + numberOfCard + " Balance = " + balance);
    }

}
