package Lesson_6.Lesson_6_Task_2;

public abstract class Worker {
    String jobTitle;
    int salary;
    Worker(int salary, String jobTitle){
        this.jobTitle = jobTitle;
        this.salary=salary;
    }

}
