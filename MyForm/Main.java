package MyForm;

import MyForm.DAO.ConexaoDAO;
import MyForm.DAO.FuncionariosDAO;
import MyForm.DTO.FuncionariosDTO;
import MyForm.View.Tela;
import SeachBd.DAO.FuncDAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Connection conexao = null;
        try {
            Tela tela = new Tela();
            tela.pack();
            tela.setVisible(true);

            FuncionariosDTO funcionario = new FuncionariosDTO(tela.getNomeUser().getText(), tela.getSenhaUser().getText());
            FuncionariosDAO funcionariosDAO = new FuncionariosDAO();
            funcionariosDAO.cadastrarFuncionario(funcionario);
            Scanner sc = new Scanner(System.in);
            FuncDAO fu = new FuncDAO();
            System.out.println("Digite o nome:");
            String nome = sc.next();
            FuncionariosDTO f = new FuncionariosDTO(nome);

            funcionariosDAO.pesquisar(f);
            ConexaoDAO conexaoDAO = new ConexaoDAO();
            conexao = conexaoDAO.conectaBD();

            // faça algo com a conexão...

        } catch (SQLException e) {
            System.out.println("Ocorreu um erro durante a execução do programa: " + e.getMessage());
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException e) {
                    System.out.println("Erro ao fechar a conexão com o banco de dados: " + e.getMessage());
                }
            }
        }
    }
}
