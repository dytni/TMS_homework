package Lesson_5.Lesson_5_Task_3;

//класс посредник между ATM и Denomination содержит вычисления объекта в который нужно добавить информацию
public class Money {
    static Denomination[] denominations = new Denomination[]{Denomination.DOLLAR_20,
            Denomination.DOLLAR_50, Denomination.DOLLAR_100};

    public void setCount(int count, Denomination denomination) {
        if (denomination == Denomination.DOLLAR_20) denominations[0].changeCount(count);
        else if (denomination == Denomination.DOLLAR_50) denominations[1].changeCount(count);
        else if (denomination == Denomination.DOLLAR_100) denominations[2].changeCount(count);
    }

    public void addCount(int count, Denomination denomination) {
        if (denomination == Denomination.DOLLAR_20) denominations[0].addCount(count);
        else if (denomination == Denomination.DOLLAR_50) denominations[1].addCount(count);
        else if (denomination == Denomination.DOLLAR_100) denominations[2].addCount(count);
    }

    int getCount(Denomination denomination) {
        if (denomination == Denomination.DOLLAR_20) return denominations[0].getCount();
        if (denomination == Denomination.DOLLAR_50) return denominations[1].getCount();
        if (denomination == Denomination.DOLLAR_100) return denominations[2].getCount();
        return 0;
    }

}
