package Lesson_7.Lesson_7_Task_1;

public class Lesson_7_task_1 {
    public static void main(String[] args) {
        Phone phone1 = new Phone(802985656, 209, "iphone");
        Phone phone2 = new Phone(802911111, 315, "pocofon x3000 powerX limited edition");
        Phone phone3 = new Phone(802900000, "nokia");
        phone1.receiveCall("ваня");
        System.out.println("number: " + phone3.getNumber());
        phone2.receiveCall("олег", phone1);
        phone3.receiveCall("артур", phone2);
        System.out.println();
        phone1.sendMassage("hi", phone2, phone3);

    }
}
