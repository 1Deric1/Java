package ExeHer_Poli;

import ExeHer_Poli.DAO.PessoasDAO;
import ExeHer_Poli.DTO.PessoasDTO;
import NewSeachBd.DAO.ConectionDAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection con = null;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your name: ");
            String name = sc.next();
            System.out.println("Enter your pass: ");
            String pass = sc.next();
            PessoasDTO p = new PessoasDTO(name, pass);
            PessoasDAO pe = new PessoasDAO();
            ConectionDAO d = new ConectionDAO();
            pe.insertBD(p);
            con = d.ConectionBD();
            sc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            if (con!=null){
                System.out.println("Seus dados foram salvos!!");
                con.close();
            }
        }

    }
}
