package Lesson_6.Lesson_6_Task_2;

public class Director extends Worker implements Print{

    public void print() {
        System.out.println("Work title "+ jobTitle + " Salary "+salary);
    }
    Director(String jobTitle, int salary){
        super(salary, jobTitle);
    }
}
