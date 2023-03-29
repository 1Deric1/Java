package Connection.Entities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {
    public int id;
    public int idade;
    public char sexo;
    public String nome;

    public Update(int id, int idade, char sexo, String nome) {
        this.id = id;
        this.idade = idade;
        this.sexo = sexo;
        this.nome = nome;
    }
    public Connection Atualizar(){
        Connection conne = null;
        try {
            String url = "jdbc:mysql://localhost:3306/users";
            String user = "root";
            String pass = "Deric*14s";

            conne = DriverManager.getConnection(url,user,pass);
            PreparedStatement stmt = conne.prepareStatement( "UPDATE pessoasu SET idade = ?, sexo = ?, nome = ? WHERE (id_pessoas = ?)");
            stmt.setInt(1, idade);
            stmt.setString(2, String.valueOf(sexo));
            stmt.setString(3, nome);
            stmt.setInt(4, id);

            int rowsAffect = stmt.executeUpdate();
            System.out.println("Done! Rows Affect "+ rowsAffect);
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return conne;
    }
}
