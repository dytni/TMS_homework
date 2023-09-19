package Lesson_7.Lesson_7_Task_2;

public class Patient {
    String name;
    String disease;
    Treatment_plan treatment_plan;
    Patient(String name, String disease, Treatment_plan treatment_plan){
        this.treatment_plan=treatment_plan;
        this.disease=disease;
        this.name=name;
    }
}
