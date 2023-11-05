package Lesson_7.Lesson_7_Task_2;

public class TreatmentPlan {
    Doctors doctors;

    TreatmentPlan(Doctors doctors) {
        this.doctors = doctors;
    }

    void addPlan() {
        if (doctors == Doctors.SURGEON) {
            Surgeon surgeon = new Surgeon();
            surgeon.heal();
        } else if (doctors == Doctors.DENTIST) {
            Dentist dentist = new Dentist();
            dentist.heal();
        } else {
            Therapist therapist = new Therapist();
            therapist.heal();
        }
    }
}
