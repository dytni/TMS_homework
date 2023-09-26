package Lesson_6.Lesson_6_task_3.Documents_classes;

import java.util.Calendar;
import java.util.Date;

public final class Worker_Contract_Document extends Document {
    String workerName;
    Date endOfDocument;

    public Worker_Contract_Document() {
        super();
        workerName = " ";
        endOfDocument = new Date(100, Calendar.JANUARY, 1);
    }

    public Worker_Contract_Document(int number, Date endOfDocument, Date date, String workerName) {
        super(number, date);
        this.workerName = workerName;
        this.endOfDocument = endOfDocument;
    }

    @Override
    public void print_info() {
        super.print_info();
        System.out.println("worker name: " + workerName);
        System.out.println("date of ending document: " + endOfDocument);
    }
}
