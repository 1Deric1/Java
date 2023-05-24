package Connection.App;

import Connection.Entities.Update;
import Connection.Entities.Inserir;
import Connection.Entities.Delete;
import Connection.Entities.Ler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws SQLException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Connection conn = null;

        Update atualizacao = null;
        try {
            int op = 1;
            while (op !=0) {
                System.out.println("Digite [1]Insert [2]Update [3]Delete [4]Ler");
                op = sc.nextInt();


                switch (op) {
                    case 1:
                        System.out.println("Digite o nome: ");
                        String nome = sc.next();
                        System.out.println("Digite a idade: ");
                        int idade = sc.nextInt();
                        System.out.println("Digite o sexo: ");
                        char sexo = sc.next().charAt(0);
                        Inserir conexao = new Inserir(nome, idade, sexo);
                        conn = conexao.conectaBD(); // inicializa o objeto conn
                        break;

                    case 2:
                        System.out.println("Digite o id: ");
                        int id = sc.nextInt();
                        sc.nextLine(); // consumir a quebra de linha após o id
                        System.out.println("Digite o Novo nome: ");
                        String novonome = sc.nextLine();
                        System.out.println("Digite a nova idade: ");
                        int novaidade = sc.nextInt();
                        System.out.println("Altere o Sexo: ");
                        char novosexo = sc.next().charAt(0);
                        atualizacao = new Update(id, novaidade, novosexo, novonome);

                        Connection novaAtualizacao = atualizacao.Atualizar();
                        break;

                    case 3:
                        System.out.println("Digite o id: ");
                        id = sc.nextInt();
                        Delete del = new Delete(id);

                        Connection de = del.Deletar();
                        break;

                    case 4:
                        Ler l = new Ler(); // instancia um objeto Ler
                        l.listColumns(sc.next()); // chama o método listTables() no objeto Ler
                        break;
                }
            }
        }

        catch (Exception e) {
            System.out.println("Erro "+e.getMessage());
        }

        finally {
            if (conn != null) { // verifica se o objeto conn foi inicializado
                try {
                    conn.close();
                }
                catch (SQLException e) {
                    System.out.println("Erro ao fechar conexão: " + e.getMessage());
                }
            }
        }
        sc.close();
    }
}