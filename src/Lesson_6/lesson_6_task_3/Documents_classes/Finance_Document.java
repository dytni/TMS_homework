package Lesson_6.lesson_6_task_3.Documents_classes;

import java.util.Date;

public final class Finance_Document extends Document{
    float total_sum;
    int department_code;
    public Finance_Document(){
        super();
        total_sum=0;
        department_code=0;
    }
    public Finance_Document(int number, Date date, int department_code, float total_sum){
        super(number, date);
        this.department_code=department_code;
        this.total_sum=total_sum;
    }

    @Override
    public void print_info() {
        super.print_info();
        System.out.println(total_sum);
        System.out.println(department_code);
    }
}
