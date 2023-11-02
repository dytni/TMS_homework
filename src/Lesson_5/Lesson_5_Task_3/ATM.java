package Lesson_5.Lesson_5_Task_3;


public class ATM {

    Money atmMoney = new Money();

    ATM(int count20, int count50, int count100) {
        atmMoney.setCount(count20, Denomination.DOLLAR_20);
        atmMoney.setCount(count50, Denomination.DOLLAR_50);
        atmMoney.setCount(count100, Denomination.DOLLAR_100);
    }
    void addMoney(int count20, int count50, int count100){
        System.out.println("Enter count of banknotes with denomination 20 ");
        atmMoney.addCount(count20, Denomination.DOLLAR_20);
        atmMoney.addCount(count50, Denomination.DOLLAR_50);
        atmMoney.addCount(count100, Denomination.DOLLAR_100);
    }

    boolean takeMoney(int sum) {
        Money money = new Money();
        int count100 = 0;
        int count50 = 0;
        int count20 = 0;
        while (sum >= 140) {
            sum = sum - 100;
            count100 += 1;
        }
        money.setCount(count100, Denomination.DOLLAR_100);
        while (sum >= 90) {
            sum = sum - 50;
            count50 += 1;
        }
        money.setCount(count50, Denomination.DOLLAR_50);
        while (sum != 0) {
            sum = sum - 20;
            count20 += 1;
        }
        money.setCount(count20, Denomination.DOLLAR_20);
        System.out.println(" You will have \n"+ count20 +" banknotes with denomination 20\n"
                + count50 +" banknotes with denomination 50\n"
                + count100 +" banknotes with denomination 100\n");
        return true;
    }
}
