package course.clients;

public class User {
    int id;
    String name;
    String surname;
    String passportId;

    public User(int id, String name, String surname, String passportId) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.passportId = passportId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPassportId() {
        return passportId;
    }
}
