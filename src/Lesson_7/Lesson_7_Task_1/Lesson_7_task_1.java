package Lesson_7.Lesson_7_Task_1;

public class Lesson_7_task_1 {
    public static void main(String[] args) {
        Phone phone_1 = new Phone(802985656, 209, "iphone");
        Phone phone_2 = new Phone(802911111, 315, "pocofon x3000 powerX limited edition");
        Phone phone_3 = new Phone(802900000, "nokia");
        phone_1.receiveCall("ваня");
        System.out.println("number: " + phone_3.getNumber());
        phone_2.receiveCall("олег", phone_1);
        phone_3.receiveCall("артур", phone_2);
        System.out.println();
        phone_1.sendMassage("hi", phone_2, phone_3);

    }
}
