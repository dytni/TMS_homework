package Lesson_6.Leson_6_Task_2;

public class Director extends Worker implements Print{

    public void print() {
        System.out.println("Work title "+ job_title+ " Salary "+salary);
    }
    Director(String job_title, int salary){
        super(salary,job_title);
    }
}
