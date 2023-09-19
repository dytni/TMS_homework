package Lesson_7.Lesson_7_Task_2;

public class Dentist implements Doctor{
    @Override
    public void heal() {
        System.out.println(" i am dentist, i delete you tooth\n");
    }
}
