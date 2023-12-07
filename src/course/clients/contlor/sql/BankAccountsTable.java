package course.clients.contlor.sql;

import course.clients.BankAccount;
import course.clients.contlor.sql.serialization.Serialization;
import course.clients.enums.OperationStatus;

import java.sql.*;
import java.util.Scanner;

public class BankAccountsTable {
    private static String URL = "jdbc:mysql://localhost:3306/bank_schema";
    private static String USERNAME = "root";
    private static String PASSWORD = "1331";
    private static String INSERT = "INSERT INTO bankaccounts(id, userid, number, accountType,balance, currency, openDate ) VALUES(?,?,?,?,?,?,?);";
    private static String SELECTBYID = "SELECT * FROM bankaccounts WHERE id = ?";
    private static String SELECTBYNUMBER = "SELECT * FROM bankaccounts WHERE number = ?";
    private static String SELECTALL = "SELECT * FROM bankaccounts";
    private static String UPDATE = "UPDATE bankaccounts SET balance = ? WHERE number = ?";

    private static String DELETE = "DELETE FROM bankaccounts WHERE userid = ?;";


    public static void inset(BankAccount bankAccount) {
        try (
                Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                PreparedStatement preparedStatement = connection.prepareStatement(INSERT)
        ) {

            Class.forName("com.mysql.cj.jdbc.Driver");

            preparedStatement.setInt(1, bankAccount.getBankAccountId());
            preparedStatement.setInt(2, bankAccount.getUserId());
            preparedStatement.setString(3, bankAccount.getAccountNumber());
            preparedStatement.setString(4, bankAccount.getAccountTypes().toString());
            preparedStatement.setFloat(5, bankAccount.getBalance());
            preparedStatement.setString(6, bankAccount.getCurrency());
            preparedStatement.setString(7, bankAccount.getOpeningDate());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void select() {
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(SELECTALL)) {

            Class.forName("com.mysql.cj.jdbc.Driver");
            ResultSet resultSet = preparedStatement.executeQuery();
            int iterator = 1;
            while (resultSet.next()) {
                System.out.println(iterator + "| number = " + resultSet.getString("number")
                        + "\nbalance = " + resultSet.getString("balance")
                        + "\ncurrency = " + resultSet.getString("currency")
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

    public static BankAccount select(int id) {
        ResultSet resultSet;
        BankAccount bankAccount = null;
        try (
                Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                PreparedStatement preparedStatement = connection.prepareStatement(SELECTBYID)
        ) {

            Class.forName("com.mysql.cj.jdbc.Driver");
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            bankAccount = Serialization.serializeBankAccount(resultSet);
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return bankAccount;
    }

    public static BankAccount select(String number) {
        ResultSet resultSet;
        BankAccount bankAccount = null;
        try (
                Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                PreparedStatement preparedStatement = connection.prepareStatement(SELECTBYNUMBER)
        ) {

            Class.forName("com.mysql.cj.jdbc.Driver");
            preparedStatement.setString(1, number);
            resultSet = preparedStatement.executeQuery();
            bankAccount = Serialization.serializeBankAccount(resultSet);
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return bankAccount;
    }

    public static OperationStatus update(float payment, String numberAccountIn, String numberAccountOut) {
        BankAccount out = select(numberAccountOut);
        float balanceOut = out.getBalance() - payment;
        if (balanceOut < 0) return OperationStatus.ERROR;
        BankAccount in = select(numberAccountIn);
        float balanceIn;
        if (in.getCurrency().equals(out.getCurrency())) {
            balanceIn = in.getBalance() + payment;
        } else {
            System.out.println("Enter exchange rate " + out.getCurrency() + " to " + in.getCurrency());
            Scanner scanner = new Scanner(System.in);
            float rate = scanner.nextInt();
            balanceIn = in.getBalance() + payment * rate;
        }
        try (
                Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                PreparedStatement preparedStatement = connection.prepareStatement(UPDATE)
        ) {

            Class.forName("com.mysql.cj.jdbc.Driver");
            preparedStatement.setFloat(1, balanceOut);
            preparedStatement.setString(2, numberAccountOut);
            preparedStatement.executeUpdate();
            PreparedStatement prepareStatement = connection.prepareStatement(UPDATE);
            prepareStatement.setFloat(1, balanceIn);
            prepareStatement.setString(2, numberAccountIn);
            prepareStatement.executeUpdate();
            prepareStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();
            return OperationStatus.ERROR;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return OperationStatus.SUCCESS;


    }

    public static void delete(int userid) {
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE)) {

            Class.forName("com.mysql.cj.jdbc.Driver");
            preparedStatement.setInt(1, userid);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}



