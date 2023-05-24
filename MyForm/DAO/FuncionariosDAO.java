package MyForm.DAO;

import MyForm.DTO.FuncionariosDTO;
import SeachBd.DAO.conexaoDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FuncionariosDAO {
    ResultSet rs;
    ArrayList<FuncionariosDTO> list = new ArrayList<>();

    public FuncionariosDAO() {
    }

    public void cadastrarFuncionario(FuncionariosDTO f) throws SQLException {
        Connection conn = null;
        try {
            conn = new ConexaoDAO().conectaBD();
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO funcionarios (nome, senha) VALUES (?, md5(?))");

            stmt.setString(1, f.getNome());
            stmt.setString(2, f.getSenha());

            stmt.executeUpdate();
            stmt.close();
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        finally {
            if (conn != null) {
                conn.close();
            }
        }
    }
    public Connection pesquisar(FuncionariosDTO f) throws SQLException {
        Connection conexao = null;
        conexaoDAO con = new conexaoDAO();
        try {
            conexao = con.ConectaDB();
            String sql = "SELECT * FROM funcionarios WHERE nome = ?";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, f.getNome());

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
