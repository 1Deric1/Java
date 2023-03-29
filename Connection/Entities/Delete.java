package Connection.Entities;

import java.sql.*;

public class Delete {
    public int id;

    public Delete(int id) {
        this.id = id;
    }

    public Connection Deletar(){
        Connection cone = null;
        try {
            String Url = "jdbc:mysql://localhost:3306/users";
            String User = "root";
            String Pass = "Deric*14s";
            cone = DriverManager.getConnection(Url,User,Pass);

            PreparedStatement pst = cone.prepareStatement("DELETE FROM pessoasu WHERE id_pessoas = ?");
            pst.setInt(1,id);
            int rowsAffect = pst.executeUpdate();

            System.out.println("Done! Delected row nª " + id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return cone;
    }

}
