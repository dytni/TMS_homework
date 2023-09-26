package Lesson_6.Lesson_6_Task_2;

public class lesson_6_Task_2 {
     public static void main(String[] args) {
          Director director = new Director("director", 15000);
          Accountant accountant= new Accountant(9000, "accountant");
          accountant.print();
          System.out.println();
          director.print();


     }
}
