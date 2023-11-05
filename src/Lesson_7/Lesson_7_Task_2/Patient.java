package Lesson_7.Lesson_7_Task_2;

public class Patient {
    String name;
    String disease;
    TreatmentPlan treatmentPlan;
    Patient(String name, String disease, TreatmentPlan treatmentPlan){
        this.treatmentPlan = treatmentPlan;
        this.disease=disease;
        this.name=name;
    }
}
