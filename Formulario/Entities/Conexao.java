package Formulario.Entities;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Conexao {
    public String nome;
    public String senha;

    public Conexao(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public Connection InserirBD(){
        Connection conn= null;
        try {
            String url = "jdbc:mysql://localhost:3306/users";
            String user = "root";
            String pass = "Deric*14s";
            conn = DriverManager.getConnection(url,user,pass);

            String sql = "INSERT INTO user (nome,senha) VALUES(?,?)";

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1,nome);
            stmt.setString(2, senha);

            stmt.executeUpdate();
            stmt.close();
            conn.close();
        }

        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return conn;
    }
}
