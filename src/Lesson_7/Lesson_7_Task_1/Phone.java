package Lesson_7.Lesson_7_Task_1;

public class Phone {
    private final int number;
    private final float weight;
    private final String model;
    Phone(int number, float weight, String model){
        this.number=number;
        this.weight= weight;
        this.model=model;
    }
    public int getNumber() {
        return number;
    }
    void receiveCall(String name){
        System.out.println("Enter call "+ name);
    }
}
