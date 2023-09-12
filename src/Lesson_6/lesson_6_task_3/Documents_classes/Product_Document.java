package Lesson_6.lesson_6_task_3.Documents_classes;

import Lesson_6.lesson_6_task_3.Documents_classes.Document;

import java.util.Date;

public final class Product_Document extends Document {
    String prod_type;
    int amount_of_prod;
    Product_Document(){
        super();
        prod_type=" ";
        amount_of_prod=0;
    }
    Product_Document(Date date, int number, int amount_of_prod, String prod_type){
        super(number,date);
        this.prod_type=prod_type;
        this.amount_of_prod=amount_of_prod;
    }
    @Override
    public void print_info() {
        super.print_info();
        System.out.println(prod_type);
        System.out.println(amount_of_prod);
    }
}
