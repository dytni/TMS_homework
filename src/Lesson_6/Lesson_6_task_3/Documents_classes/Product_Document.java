package Lesson_6.Lesson_6_task_3.Documents_classes;

import java.util.Date;

public final class Product_Document extends Document {
    String prodType;
    int amountOfProd;
    public Product_Document(){
        super();
        prodType =" ";
        amountOfProd =0;
    }
    public Product_Document(Date date, int number, int amountOfProd, String prodType){
        super(number,date);
        this.amountOfProd = amountOfProd;
        this.prodType = prodType;
    }
    @Override
    public void print_info() {
        super.print_info();
        System.out.println("amount of product: " + amountOfProd);
        System.out.println("type of product: " + prodType);
    }
}
