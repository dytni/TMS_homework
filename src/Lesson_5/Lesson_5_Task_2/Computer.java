package Lesson_5.Lesson_5_Task_2;

public class Computer {
    int coast;
    String model;
    RAM yourRam = new RAM();
    HDD yourHdd = new HDD();

    Computer(int coastPc, String modelPc) {
        coast = coastPc;
        model = modelPc;
    }

    Computer(int coastPc, String modelPc, HDD hddPc, RAM ramPc) {
        coast = coastPc;
        model = modelPc;
        yourHdd = hddPc;
        yourRam = ramPc;
    }

    void printInfo() {
        System.out.println("model PC " + model + " coast = " + coast);
        System.out.println();
        System.out.println(" RAM info:");
        yourRam.printInfo();
        System.out.println();
        System.out.println(" HDD info:");
        yourHdd.printInfo();
    }
}
