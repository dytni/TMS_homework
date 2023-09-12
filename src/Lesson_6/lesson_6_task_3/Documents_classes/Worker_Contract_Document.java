package Lesson_6.lesson_6_task_3.Documents_classes;

import Lesson_6.Leson_6_Task_2.Worker;
import Lesson_6.lesson_6_task_3.Documents_classes.Document;

import java.util.Calendar;
import java.util.Date;

public final class Worker_Contract_Document extends Document {
    String worker_name;
    Date end_of_document;
    public Worker_Contract_Document(){
        super();
        worker_name=" ";
        end_of_document=new Date(100, Calendar.JANUARY,1);
    }
    public Worker_Contract_Document(int number, Date end_of_document, Date date, String worker_name){
        super(number,date);
        this.worker_name=worker_name;
        this.end_of_document=end_of_document;
    }

    @Override
    public void print_info() {
        super.print_info();
        System.out.println("worker name: "+worker_name);
        System.out.println("date of ending document: "+end_of_document);
    }
}
