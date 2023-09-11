package Lesson_6.Leson_6_Task_2;

public class Accountant extends Worker implements Print{
    @Override
    public void print() {
        System.out.println("Work title "+ job_title + " Salary "+ salary);
    }
    Accountant(int salary, String job_title){
        super(salary,job_title);
    }
}
