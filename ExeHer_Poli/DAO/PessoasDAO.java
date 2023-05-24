package ExeHer_Poli.DAO;

import ExeHer_Poli.DTO.PessoasDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PessoasDAO {
    public Connection insertBD(PessoasDTO p) throws SQLException {
        Connection connet = null;
        try {
            connet = new ConexaoDao().ConectaBd();
            PreparedStatement pstmt = connet.prepareStatement("INSERT INTO user(nome,senha) VALUES (?,?)");
            pstmt.setString(1,p.getName());
            pstmt.setString(2,p.getPass());
            pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            if (connet!=null) {
                connet.close();
            }
        }
        return connet;
    }
}
