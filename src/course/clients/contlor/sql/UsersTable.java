package course.clients.contlor.sql;

import course.clients.User;
import course.clients.contlor.sql.serialization.Serialization;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UsersTable {
    private static final String URL = "jdbc:mysql://localhost:3306/bank_schema";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "1331";
    private static String INSERT = "INSERT INTO bankusers(id, name, surname, passport_ID) VALUES(?,?,?,?);";
    private static final String SELECT = "SELECT * FROM bankusers;";
    private static String DELETE = "DELETE FROM bankusers WHERE id = ?;";



    public static void inset(User user) {
        try (
                Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                PreparedStatement preparedStatement = connection.prepareStatement(INSERT)
        ) {

            Class.forName("com.mysql.cj.jdbc.Driver");
            preparedStatement.setInt(1, user.getId());
            preparedStatement.setString(2, user.getName());
            preparedStatement.setString(3, user.getSurname());
            preparedStatement.setString(4, user.getPassportId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void select() {
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT)) {

            Class.forName("com.mysql.cj.jdbc.Driver");
            ResultSet resultSet = preparedStatement.executeQuery();
            int iterator = 1;
            while (resultSet.next()) {
                System.out.println(iterator + "| id = " + resultSet.getInt("id")
                        + "\nname = " + resultSet.getString("name")
                        + "\nsurname = " + resultSet.getString("surname")
                        + "\n------------------");
                iterator = iterator + 1;
            }
            resultSet.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void delete() {
        try (
                Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT)) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            ResultSet resultSet = preparedStatement.executeQuery();
            List<User> users = new ArrayList<>();
            while (resultSet.next()) {
                users.add(Serialization.serializeUser(resultSet));
            }
            for (int i = 0; i < users.size(); i++) {
                System.out.println((i + 1) + "| id = " + users.get(i).getId()
                        + "\nname = " + users.get(i).getName()
                        + "\n------------------");
            }
            System.out.println("Enter number of user or 0 for escape");
            Scanner scanner = new Scanner(System.in);
            int choose = scanner.nextInt();
            if (choose == 0) return;
            int id = users.get(choose - 1).getId();
            preparedStatement.close();
            PreparedStatement prepareStatement = connection.prepareStatement(DELETE);
            prepareStatement.setInt(1, id);
            prepareStatement.executeUpdate();
            prepareStatement.close();
            BankAccountsTable.delete(id);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


}
