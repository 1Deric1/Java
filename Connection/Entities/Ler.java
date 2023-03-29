package Connection.Entities;
import java.sql.*;
public class Ler {
    public Connection listColumns(String tableName) {
        String url = "jdbc:mysql://localhost:3306/users";
        String username = "root";
        String password = "Deric*14s";

        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            DatabaseMetaData metadata = conn.getMetaData();
            ResultSet columns = metadata.getColumns(null, null, tableName, null);
            while (columns.next()) {
                String columnName = columns.getString("COLUMN_NAME");
                System.out.println(columnName);
            }
        }
        catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
        return null;
    }
}
