package Lesson_7.Lesson_7_Task_2;

public class Main {
     public static void main(String[] args) {
         Treatment_plan treatment_plan= new Treatment_plan();
         Patient patient= new Patient("Ivan", "Corona", treatment_plan);
         patient.treatment_plan.add_plan(1);
     }
}
