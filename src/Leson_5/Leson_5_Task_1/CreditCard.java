package Leson_5.Leson_5_Task_1;

public class CreditCard {

    int number_of_card;
    int balance;

    void add_cash(int sum) {
        balance = balance + sum;
    }

    void take_cash(int sum) {
        balance = balance - sum;
    }

    void show_info() {
        System.out.println("Card number " + number_of_card + " Balance = " + balance);
    }

}
