package Lesson_6.Lesson_6_Task_1;

public class Rectangle extends Figure{
    double a_side;
    double b_side;
    Rectangle(double a_side, double b_side){
        this.a_side=a_side;
        this.b_side=b_side;
        this.setPerimeter();
        this.setArea();
    }
    double setPerimeter(){
        perimeter=(a_side+b_side)*2;
        return perimeter;
    }
    double setArea(){
        area=a_side*b_side;
        return area;
    }

}
