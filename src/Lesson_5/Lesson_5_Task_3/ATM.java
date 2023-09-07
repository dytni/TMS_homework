package Lesson_5.Lesson_5_Task_3;

import java.util.Scanner;

public class ATM {

    Money atm_money = new Money();

    ATM(int count_20,int count_50, int count_100) {
        atm_money.setCount(count_20, Denomination.dollar_20);
        atm_money.setCount(count_50, Denomination.dollar_50);
        atm_money.setCount(count_100, Denomination.dollar_100);
    }
    void add_money(){
        System.out.println("Enter count of banknotes with denomination 20 ");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        atm_money.addCount(count, Denomination.dollar_20);
        System.out.println("Enter count of banknotes with denomination 50 ");
        count = scanner.nextInt();
        atm_money.addCount(count, Denomination.dollar_50);
        System.out.println("Enter count of banknotes with denomination 100 ");
        count = scanner.nextInt();
        atm_money.addCount(count, Denomination.dollar_100);
    }

    boolean take_money(int sum) {
        Money money = new Money();
        int count_100 = 0;
        int count_50 = 0;
        int count_20 = 0;
        while (sum >= 140) {
            sum = sum - 100;
            count_100 += 1;
        }
        money.setCount(count_100, Denomination.dollar_100);
        while (sum >= 90) {
            sum = sum - 50;
            count_50 += 1;
        }
        money.setCount(count_50, Denomination.dollar_50);
        while (sum != 0) {
            sum = sum - 20;
            count_20 += 1;
        }
        money.setCount(count_20, Denomination.dollar_20);
        System.out.println(" You will have \n"+ count_20+" banknotes with denomination 20\n"
                + count_50+" banknotes with denomination 50\n"
                + count_100+" banknotes with denomination 100\n");
        return true;
    }
}
