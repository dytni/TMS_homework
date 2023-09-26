package Lesson_6.Lesson_6_task_3.Documents_classes;

import java.util.Date;

public final class ProductDocument extends Document {
    String prodType;
    int amountOfProd;
    public ProductDocument(){
        super();
        prodType =" ";
        amountOfProd =0;
    }
    public ProductDocument(Date date, int number, int amountOfProd, String prodType){
        super(number,date);
        this.amountOfProd = amountOfProd;
        this.prodType = prodType;
    }
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("amount of product: " + amountOfProd);
        System.out.println("type of product: " + prodType);
    }
}
