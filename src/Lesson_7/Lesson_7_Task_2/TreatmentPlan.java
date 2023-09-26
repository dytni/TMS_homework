package Lesson_7.Lesson_7_Task_2;

public class TreatmentPlan {
    void addPlan(int kod){
        if(kod==1){
            Surgeon surgeon = new Surgeon();
            surgeon.heal();
        } else if (kod==2) {
            Dentist dentist= new Dentist();
            dentist.heal();
        }else {
            Therapist therapist = new Therapist();
            therapist.heal();
        }
    }
}
