package Lesson_6.Lesson_6_Task_1;

public class Task1 {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        double sum=0;
        figures[0]= new Triangle(5,4,3);
        figures[1]= new Rectangle(6,8);
        figures[2]= new Rectangle(5,4);
        figures[3]= new Circle(5);
        figures[4]= new Triangle(5,4,3);
        for(int i=0;i<5;i++){
            sum+=figures[i].perimeter;
        }
        System.out.println(sum);
    }
}
