package Lesson_6.Lesson_6_task_3.Documents_classes;

import java.util.Date;

public final class Finance_Document extends Document {
    float totalSum;
    int departmentCode;

    public Finance_Document() {
        super();
        totalSum = 0;
        departmentCode = 0;
    }

    public Finance_Document(int number, Date date, int departmentCode, float totalSum) {
        super(number, date);
        this.departmentCode = departmentCode;
        this.totalSum = totalSum;
    }

    @Override
    public void print_info() {
        super.print_info();
        System.out.println("department code: " + departmentCode);
        System.out.println("total sum: " + totalSum);
    }
}
