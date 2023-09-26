package Lesson_6.Lesson_6_task_3;

import Lesson_6.Lesson_6_task_3.Documents_classes.Document;

public class Register {
    Document[] array = new Document[10];
    static int index = 0;

    void add_doc(Document document) {
        array[index] = document;
        index += 1;
    }

    public void show_info() {
        for (int i = 0; i < index; i++) {
            array[i].print_info();
            System.out.println();
        }

    }
}
