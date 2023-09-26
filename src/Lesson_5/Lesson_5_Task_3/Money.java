package Lesson_5.Lesson_5_Task_3;
//класс посредник между ATM и Denomination содержит вычисления объекта в который нужно добавить информацию
public class Money {
    static Denomination[] denominations= new Denomination[]{Denomination.dollar20,
            Denomination.dollar50,Denomination.dollar100};
    public void setCount(int count, Denomination denomination){
        if(denomination==Denomination.dollar20)denominations[0].changeCount(count);

        if(denomination==Denomination.dollar50)denominations[1].changeCount(count);

        if(denomination==Denomination.dollar100)denominations[2].changeCount(count);
    }
    public void addCount(int count,Denomination denomination){
        if(denomination==Denomination.dollar20)denominations[0].addCount(count);

        if(denomination==Denomination.dollar50)denominations[1].addCount(count);

        if(denomination==Denomination.dollar100)denominations[2].addCount(count);
    }
    int getCount(Denomination denomination){
        if(denomination==Denomination.dollar20)return denominations[0].getCount();

        if(denomination==Denomination.dollar50)return denominations[1].getCount();

        if(denomination==Denomination.dollar100)return denominations[2].getCount();

        return 0;
    }

}
