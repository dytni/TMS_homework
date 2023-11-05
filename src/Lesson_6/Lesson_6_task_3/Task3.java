package Lesson_6.Lesson_6_task_3;

import Lesson_6.Lesson_6_task_3.Documents_classes.ProductDocument;
import Lesson_6.Lesson_6_task_3.Documents_classes.WorkerContractDocument;

import java.util.Calendar;
import java.util.Date;

public class Task3 {
    public static void main(String[] args) {
        Register register = new Register();
        Date date = new Date(100, Calendar.JANUARY, 1);
        ProductDocument productDocument = new ProductDocument(date, 100002, 12, "flowers");
        WorkerContractDocument workerContractDocument = new WorkerContractDocument(100003, date, date, "nikolay");
        register.addDoc(productDocument);
        register.addDoc(workerContractDocument);
        register.showInfo();
    }
}
