package Lesson_5.Lesson_5_Task_3;

public enum Denomination {
    dollar_20(0),
    dollar_50(0),
    dollar_100(0);
    private int count;

    Denomination(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }
    public void changeCount(int count){
        this.count=this.count-count;

    }
    public void addCount(int count){
        this.count=this.count+count;
    }
}
