package Lesson_6.Lesson_6_Task_1;

public class Circle extends Figure{
    double radius;
    final double PI= 3.14;
    Circle(double radius){
        this.radius=radius;
        this.setPerimeter();
        this.setArea();
    }
    double setArea(){
        area=PI*radius*radius;
        return area;
    }
    double setPerimeter(){
        perimeter=2*PI*radius;
        return perimeter;
    }
}
