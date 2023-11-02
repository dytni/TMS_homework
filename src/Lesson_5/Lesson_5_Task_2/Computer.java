package Lesson_5.Lesson_5_Task_2;

public class Computer {
    int coast;
    String model;
    RAM Ram = new RAM();
    HDD Hdd = new HDD();

    Computer(int coastPc, String modelPc) {
        coast = coastPc;
        model = modelPc;
    }

    Computer(int coastPc, String modelPc, HDD hddPc, RAM ramPc) {
        coast = coastPc;
        model = modelPc;
        Hdd = hddPc;
        Ram = ramPc;
    }

    void printInfo() {
        System.out.println("model PC " + model + " coast = " + coast);
        System.out.println();
        System.out.println(" RAM info:");
        Ram.printInfo();
        System.out.println();
        System.out.println(" HDD info:");
        Hdd.printInfo();
    }
}
