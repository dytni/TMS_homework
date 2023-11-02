package Lesson_5.Lesson_5_Task_2;

public class RAM {

        String name;
        int storage;


        RAM() {
            name = "Lenovo";
            storage = 4;
        }

        RAM(String ramName, int ramStorage) {
            name = ramName;
            storage = ramStorage;
        }

        void printInfo() {
            System.out.println("name: " + name + " storage = " + storage + " gb");
        }
}
