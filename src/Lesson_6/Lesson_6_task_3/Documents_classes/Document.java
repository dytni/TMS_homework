package Lesson_6.Lesson_6_task_3.Documents_classes;

import java.util.Calendar;
import java.util.Date;

public abstract class Document implements Print_info {
    int number;
    Date date;

    public Document() {
        number = 0;
        date = new Date(100, Calendar.JANUARY, 1);
    }

    public Document(int number, Date date) {
        this.number = number;
        this.date = date;
    }

    public void print_info() {
        System.out.println("number of document: " + number);
        System.out.println("date of signing the document: " + date);

    }

}
