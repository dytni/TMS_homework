package Lesson_6.Lesson_6_task_3;

import Lesson_6.Lesson_6_task_3.Documents_classes.Document;

public class Register {
    Document[] array = new Document[10];
    static int index = 0;

    void addDoc(Document document) {
        array[index] = document;
        index += 1;
    }

    public void showInfo() {
        for (int i = 0; i < index; i++) {
            array[i].printInfo();
            System.out.println();
        }

    }
}
