package Lesson_6.Lesson_6_task_3;

import Lesson_6.Lesson_6_task_3.Documents_classes.Product_Document;
import Lesson_6.Lesson_6_task_3.Documents_classes.Worker_Contract_Document;

import java.util.Calendar;
import java.util.Date;

public class lesson_6_task_3 {
    public static void main(String[] args) {
        Register register = new Register();
        Date date = new Date(100, Calendar.JANUARY, 1);
        Product_Document productDocument = new Product_Document(date, 100002, 12, "flowers");
        Worker_Contract_Document workerContractDocument = new Worker_Contract_Document(100003, date, date, "nikolay");
        register.add_doc(productDocument);
        register.add_doc(workerContractDocument);
        register.show_info();
    }
}
