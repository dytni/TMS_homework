package course.clients.contlor.sql.serialization;

import course.clients.BankAccount;
import course.clients.BankOperation;
import course.clients.User;
import course.clients.enums.AccountTypes;
import course.clients.enums.OperationStatus;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Serialization {
    public static BankAccount serializeBankAccount(ResultSet resultSet) throws SQLException {
        AccountTypes accountType = AccountTypes.valueOf(resultSet.getString("accountType"));
        return new BankAccount(resultSet.getInt("id"),
                resultSet.getInt("userid"), resultSet.getString("number"),
                resultSet.getString("openDate"), accountType, resultSet.getFloat("balance"),
                resultSet.getString("currency"));
    }

    public static BankOperation serializeBankOperation(ResultSet resultSet) throws SQLException {

        OperationStatus operationStatus = OperationStatus.valueOf(resultSet.getString("status"));
        return new BankOperation(resultSet.getInt("id"),
                resultSet.getString("accountIn"), resultSet.getString("accountOut"),
                resultSet.getFloat("payment"),
                resultSet.getString("date"), operationStatus);
    }

    public static User serializeUser(ResultSet resultSet) throws SQLException {
        return new User(resultSet.getInt("id"), resultSet.getString("name"),
                resultSet.getString("surname")
                , resultSet.getString("passport_ID"));
    }
}
