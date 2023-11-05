package Lesson_6.Lesson_6_Task_2;

public class Accountant extends Worker implements Print{
    @Override
    public void print() {
        System.out.println("Work title "+ jobTitle + " Salary "+ salary);
    }
    Accountant(int salary, String jobTitle){
        super(salary, jobTitle);
    }
}
