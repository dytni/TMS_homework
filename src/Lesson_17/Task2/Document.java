package Lesson_17.Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Document {
    List<String> documentNumber;
    String phoneNumber;
    String email;
    int id;

    Document() {
        documentNumber = new ArrayList<>();
        phoneNumber = "1234";
        email = "0987";
        id = 0;
    }

    @Override
    public int hashCode() {
        return id * id - id * 734;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        // проверка, что переданный объект является экземпляром класса Document
        if (!(obj instanceof Document)) return false;

        // приведение объекта к типу Document
        Document document = (Document) obj;

        // сравнение полей объектов
        return id == document.id &&
                Objects.equals(phoneNumber, document.phoneNumber);
    }

    public void addDocumentNumber(String documentNumber) {
        this.documentNumber.add(documentNumber);

    }

    public void addPhoneNumber(String
                                       phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void addEmail(String email) {
        this.email = email;
    }

    public String ValuesForID() {
        if (documentNumber.isEmpty()) {
            return phoneNumber.substring(9, 11) + email.substring(0, 2);
        }
        return documentNumber.get(0);
    }
}
