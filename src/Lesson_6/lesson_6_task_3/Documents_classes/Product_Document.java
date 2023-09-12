package Lesson_6.lesson_6_task_3.Documents_classes;

import Lesson_6.lesson_6_task_3.Documents_classes.Document;

import java.util.Date;

public final class Product_Document extends Document {
    String prod_type;
    int amount_of_prod;
    public Product_Document(){
        super();
        prod_type=" ";
        amount_of_prod=0;
    }
    public Product_Document(Date date, int number, int amount_of_prod, String prod_type){
        super(number,date);
        this.amount_of_prod=amount_of_prod;
        this.prod_type=prod_type;
    }
    @Override
    public void print_info() {
        super.print_info();
        System.out.println("amount of product: " + amount_of_prod);
        System.out.println("type of product: " + prod_type);
    }
}
