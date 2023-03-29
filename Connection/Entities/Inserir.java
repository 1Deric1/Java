package Connection.Entities;

import javax.swing.*;
import java.sql.*;

import static java.sql.Statement.RETURN_GENERATED_KEYS;

public class Inserir {
    public int id;
    public String nome;
    public int idade;
    public char sexo;

    public Inserir() {
    }

    public Inserir(String nome, int idade, char sexo) {
        //this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public Connection conectaBD() {
        Connection conexao = null;
        try {
            String url = "jdbc:mysql://localhost:3306/users";
            String usuario = "root";
            String senha = "Deric*14s";

            conexao = DriverManager.getConnection(url, usuario, senha);

            PreparedStatement stmt = conexao.prepareStatement ("INSERT INTO pessoasu ( nome, idade, sexo) VALUES (?, ?, ?)", RETURN_GENERATED_KEYS);

            //Definir os valores dos parâmetros dos comandos SQL,
            //stmt.setInt(1, id); #retirei o id pq ele e AI
            stmt.setString(1, nome);
            stmt.setInt(2, idade);
            stmt.setString(3, String.valueOf(sexo));

            //Executar o comando SQL e atualizar a tabela de banco de dados.
            int rowsAffected = stmt.executeUpdate();

            //Pegar o id gerado automatico e retorna
            if (rowsAffected > 0){
                ResultSet rs = stmt.getGeneratedKeys();
                while(rs.next()){
                    int id = rs.getInt(1);
                    System.out.println("Affected! your id is = "+ id);
                }
            }
            else {
                System.out.println("Nenhuma linha alterada");
            }
            stmt.close();
            conexao.close();
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return conexao;
    }

}
