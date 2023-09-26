package Lesson_6.Lesson_6_task_3.Documents_classes;

import java.util.Calendar;
import java.util.Date;

public final class WorkerContractDocument extends Document {
    String workerName;
    Date endOfDocument;

    public WorkerContractDocument() {
        super();
        workerName = " ";
        endOfDocument = new Date(100, Calendar.JANUARY, 1);
    }

    public WorkerContractDocument(int number, Date endOfDocument, Date date, String workerName) {
        super(number, date);
        this.workerName = workerName;
        this.endOfDocument = endOfDocument;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("worker name: " + workerName);
        System.out.println("date of ending document: " + endOfDocument);
    }
}
