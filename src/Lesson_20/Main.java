package Lesson_20;
//. Скачать и установить СУБД MySQL. Создать таблицу с данными
//        студентов группы. Создать Java приложение для получения списка всех
//        студентов группы.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    private static void initializeDriver() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/students_schema";
        String username = "root";
        String password = "1331";

        initializeDriver();

        try {

            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            String createTableQuery = "CREATE TABLE IF NOT EXISTS students (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(100), surname VARCHAR(100), marks int)";
            statement.executeUpdate(createTableQuery);

            String getAllStudentsQuery = "SELECT * FROM students";
            ResultSet resultSet = statement.executeQuery(getAllStudentsQuery);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                float marks = resultSet.getFloat("marks");
                System.out.println("ID: " + id + ", Name: " + name + ", Surname: " + surname + ", Marks: " + marks);
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
