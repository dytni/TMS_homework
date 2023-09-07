package Lesson_6.Lesson_6_Task_1;

public class Triangle extends Figure {
    double a_side;
    double b_side;
    double c_side;

    Triangle(double a_side, double b_side, double c_side) {
        this.a_side = a_side;
        this.b_side = b_side;
        this.c_side = c_side;
        this.setPerimeter();
        this.setArea();
    }

    double setPerimeter() {
        perimeter = a_side + b_side + c_side;
        return perimeter;
    }

    double setArea() {
        area = Math.sqrt((perimeter / 2) * (perimeter / 2 - a_side)
                * (perimeter / 2 - b_side) * (perimeter / 2 - c_side));
        return area;
    }
}