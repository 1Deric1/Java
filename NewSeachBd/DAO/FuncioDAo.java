package NewSeachBd.DAO;

import NewSeachBd.DTO.FuncioDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FuncioDAo {
    public Connection insertBd(FuncioDTO f) throws SQLException {

        Connection conn = null;
        try {
            conn = new ConectionDAO().ConectionBD();
            PreparedStatement pstmt = conn.prepareStatement("INSERT INTO funcionarios(nome,senha) VALUES (?,?)");
            pstmt.setString(1, f.getName());
            pstmt.setString(2, f.getPass());
            pstmt.executeUpdate();
            pstmt.close();
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
        finally {
            if (conn!=null){
                conn.close();
            }
        }
        return conn;
    }
}