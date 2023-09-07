package Lesson_5.Lesson_5_Task_2;

public class Computer {
    int coast;
    String model;
    RAM your_ram = new RAM();
    HDD your_hdd = new HDD();

    Computer(int coast_pc, String model_pc) {
        coast = coast_pc;
        model = model_pc;
    }

    Computer(int coast_pc, String model_pc, HDD hdd_pc, RAM ram_pc) {
        coast = coast_pc;
        model = model_pc;
        your_hdd = hdd_pc;
        your_ram = ram_pc;
    }

    void print_info() {
        System.out.println("model PC " + model + " coast = " + coast);
        System.out.println();
        System.out.println(" RAM info:");
        your_ram.print_info();
        System.out.println();
        System.out.println(" HDD info:");
        your_hdd.print_info();
    }
}
