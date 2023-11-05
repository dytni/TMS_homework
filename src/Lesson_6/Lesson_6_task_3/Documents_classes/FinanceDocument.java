package Lesson_6.Lesson_6_task_3.Documents_classes;

import java.util.Date;

public final class FinanceDocument extends Document {
    float totalSum;
    int departmentCode;

    public FinanceDocument() {
        super();
        totalSum = 0;
        departmentCode = 0;
    }

    public FinanceDocument(int number, Date date, int departmentCode, float totalSum) {
        super(number, date);
        this.departmentCode = departmentCode;
        this.totalSum = totalSum;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("department code: " + departmentCode);
        System.out.println("total sum: " + totalSum);
    }
}
