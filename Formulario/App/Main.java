package Formulario.App;

import Formulario.Entities.Conexao;
import Formulario.Entities.Ler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Connection conn = null;
        Conexao co = null;
        try {
            int op = 1;
            while (op != 0) {
                op = Integer.parseInt(JOptionPane.showInputDialog("Digite:\n[1]Inserir\n[2]Mostrar","Digite aqui"));
                switch (op) {
                    case 1:

                        String userU = JOptionPane.showInputDialog("Digite seu nome","Digite seu nome aqui");
                        String senhaU = JOptionPane.showInputDialog("Digite sua senha","Digite sua senha aqui");
                        co = new Conexao(userU, senhaU);
                        break;
                    case 2:
                        String ler = JOptionPane.showInputDialog("Buscar tabela", "Digite o nome do banco de dados");
                        conn = co.InserirBD();
                        conn = Ler.InserirBD(ler);
                        break;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Não conectado");
            }
        }
        sc.close();
    }
}