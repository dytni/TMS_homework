package course.clients.contlor.sql;

import course.clients.BankOperation;
import course.clients.contlor.sql.serialization.Serialization;

import java.sql.*;

public class OperationHistoryTable {
    private static String URL = "jdbc:mysql://localhost:3306/bank_schema";
    private static String USERNAME = "root";
    private static String PASSWORD = "1331";
    private static String INSERT = "INSERT INTO bankoperation(id,accountIn,accountOut,payment,date,status) VALUES(?,?,?,?,?,?);";

    private static String SELECT = "SELECT * FROM bankoperation WHERE accountIn = ? AND accountOut = ? AND payment = ? AND status = ?;";

    public static void inset(BankOperation bankOperation) {
        try (
                Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                PreparedStatement preparedStatement = connection.prepareStatement(INSERT)
        ) {

            Class.forName("com.mysql.cj.jdbc.Driver");
            preparedStatement.setInt(1, bankOperation.getOperationId());
            preparedStatement.setString(2, bankOperation.getNumberAccountIn());
            preparedStatement.setString(3, bankOperation.getNumberAccountOut());
            preparedStatement.setFloat(4, bankOperation.getPayment());
            preparedStatement.setString(5, bankOperation.getDateTime());
            preparedStatement.setString(6, bankOperation.getStatus().toString());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static BankOperation select(int accountIn, int accountOut, float payment, String status) {
        ResultSet resultSet;
        BankOperation bankOperation = null;
        try (
                Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

                PreparedStatement preparedStatement = connection.prepareStatement(SELECT)
        ) {

            Class.forName("com.mysql.cj.jdbc.Driver");
            preparedStatement.setInt(1, accountIn);
            preparedStatement.setInt(2, accountOut);
            preparedStatement.setFloat(3, payment);
            preparedStatement.setString(4, status);
            resultSet = preparedStatement.executeQuery();
            bankOperation = Serialization.serializeBankOperation(resultSet);
            resultSet.close();


        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return bankOperation;
    }
}
