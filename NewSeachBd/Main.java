package NewSeachBd;

import NewSeachBd.DAO.ConectionDAO;
import NewSeachBd.DAO.FuncioDAo;
import NewSeachBd.DTO.FuncioDTO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        try {
            FuncioDAo fu = new FuncioDAo();
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite seu nome: ");
            String nome = sc.next();
            System.out.println("Digite uma senha: ");
            String senha = sc.next();
            FuncioDTO f = new FuncioDTO(nome,senha);
            ConectionDAO c = new ConectionDAO();
            fu.insertBd(f);
            connection = c.ConectionBD();
            sc.close();
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
        finally {
            if(connection!=null){
                connection.close();
            }
        }

    }
}