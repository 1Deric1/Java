package SeachBd.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexaoDAO {
    public Connection ConectaDB() throws SQLException {
        String nome = "root";
        String senha = "Deric*14s";
        String url = "jdbc:mysql://localhost:3306/users";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, nome, senha);
        } catch (SQLException e) {
            System.out.println("Erro ao tentar conectar: " + e.getMessage());
        }
        return conn;
    }
}
