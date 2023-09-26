package Lesson_6.Lesson_6_Task_1;

public class Rectangle extends Figure{
    double aSide;
    double bSide;
    Rectangle(double aSide, double bSide){
        this.aSide = aSide;
        this.bSide = bSide;
        this.setPerimeter();
        this.setArea();
    }
    double setPerimeter(){
        perimeter=(aSide + bSide)*2;
        return perimeter;
    }
    double setArea(){
        area= aSide * bSide;
        return area;
    }

}
