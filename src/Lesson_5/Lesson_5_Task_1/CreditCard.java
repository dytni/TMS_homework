package Lesson_5.Lesson_5_Task_1;

public class CreditCard {

    int numberOfCard;
    int balance;

    void add_cash(int sum) {
        balance = balance + sum;
    }

    void take_cash(int sum) {
        balance = balance - sum;
    }

    void show_info() {
        System.out.println("Card number " + numberOfCard + " Balance = " + balance);
    }

}
