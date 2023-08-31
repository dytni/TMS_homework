package Leson_5.Leson_5_Task_2;

public class RAM {

        String name;
        int storage;


        RAM() {
            name = "Lenovo";
            storage = 4;
        }

        RAM(String ram_name, int ram_storage) {
            name = ram_name;
            storage = ram_storage;
        }

        void print_info() {
            System.out.println("name: " + name + " storage = " + storage + " gb");
        }
}
