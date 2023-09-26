package Lesson_6.Lesson_6_Task_1;

public class Triangle extends Figure {
    double aSide;
    double bSide;
    double cSide;

    Triangle(double aSide, double bSide, double cSide) {
        this.aSide = aSide;
        this.bSide = bSide;
        this.cSide = cSide;
        this.setPerimeter();
        this.setArea();
    }

    double setPerimeter() {
        perimeter = aSide + bSide + cSide;
        return perimeter;
    }

    double setArea() {
        area = Math.sqrt((perimeter / 2) * (perimeter / 2 - aSide)
                * (perimeter / 2 - bSide) * (perimeter / 2 - cSide));
        return area;
    }
}