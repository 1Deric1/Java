package ExeHer_Poli.DAO;

import java.sql.*;

public class ConexaoDao {
    public Connection ConectaBd() throws SQLException {
        Connection conn = null;
        try {
            String user = "root";
            String url = "jdbc:mysql://localhost:3306/users";
            String pass = "Deric*14s";
            conn = DriverManager.getConnection(url,user, pass);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return conn;
    }
}
