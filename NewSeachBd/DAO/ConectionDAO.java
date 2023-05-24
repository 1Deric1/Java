package NewSeachBd.DAO;

import java.sql.*;

public class ConectionDAO {
    public Connection ConectionBD(){
        Connection conn = null;
        try{
            String name = "root";
            String pass = "Deric*14s";
            String url = "jdbc:mysql://localhost:3306/users";
            conn = DriverManager.getConnection(url,name,pass);
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return conn;
    }
}
