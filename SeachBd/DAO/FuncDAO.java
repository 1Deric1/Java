package SeachBd.DAO;

import NewSeachBd.DTO.FuncioDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FuncDAO {

    public Connection pesquisar(FuncioDTO f) throws SQLException {
        Connection conexao = null;
        conexaoDAO con = new conexaoDAO();
        try {
            conexao = con.ConectaDB();
            String sql = "SELECT * FROM funcionarios WHERE nome = ?";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, f.getName());

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String senha = rs.getString("senha");
                System.out.println("ID: " + id + ", Nome: " + nome + ", Senha: " + senha);

            }
        } catch (SQLException e) {
            System.out.println("Error ao pesquisar funcionario no banco de dados" + e.getMessage());
        } finally {
            if (conexao != null) {
                conexao.close();
            }
        }
        return conexao;
    }

}
