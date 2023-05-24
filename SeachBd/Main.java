package SeachBd;

import NewSeachBd.DTO.FuncioDTO;
import SeachBd.DAO.FuncDAO;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        FuncDAO fu = new FuncDAO();
        System.out.println("Digite o nome:");
        String nome = sc.next();

        FuncioDTO f = new FuncioDTO(nome);
        fu.pesquisar(f);
    }
}
