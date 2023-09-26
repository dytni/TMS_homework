package Lesson_7.Lesson_7_Task_2;

public class Main {
     public static void main(String[] args) {
         TreatmentPlan treatmentPlan = new TreatmentPlan();
         Patient patient= new Patient("Ivan", "Corona", treatmentPlan);
         patient.treatmentPlan.add_plan(1);
     }
}
