package MyForm.DAO;

import MyForm.DTO.FuncionariosDTO;

import javax.swing.*;
import java.sql.*;

import static java.sql.Statement.RETURN_GENERATED_KEYS;

public class ConexaoDAO {

    public Connection conectaBD() {
        Connection conexao = null;
        try {
            String url = "jdbc:mysql://localhost:3306/users";
            String usuario = "root";
            String senha = "Deric*14s";

            conexao = DriverManager.getConnection(url, usuario, senha);

        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return conexao;
    }
}