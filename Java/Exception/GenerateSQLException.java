import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GenerateSQLException {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:invalid:url"); // This will generate SQLException
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
        }
    }
}
