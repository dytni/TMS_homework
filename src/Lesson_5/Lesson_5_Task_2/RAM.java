package Lesson_5.Lesson_5_Task_2;

public class RAM {

        String name;
        int storage;


        RAM() {
            name = "Lenovo";
            storage = 4;
        }

        RAM(String ramNname, int ramStorage) {
            name = ramNname;
            storage = ramStorage;
        }

        void print_info() {
            System.out.println("name: " + name + " storage = " + storage + " gb");
        }
}
