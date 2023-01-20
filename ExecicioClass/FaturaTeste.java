package ExecicioClass;

import java.util.Locale;
import java.util.Scanner;

public class FaturaTeste {
    public static void main(String[] args) {
        try {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            Fatura f = new Fatura(0, 0, 0, "nenhuma");
            int i = 0, aux = 0;
            System.out.println("Digite a quantidade: ");
            f.quantidade = sc.nextInt();
            int[] qtd_p = new int[f.quantidade];

            for (i = 0; i < f.quantidade; i++) {
                System.out.println("Digite o preço: ");
                f.preco = sc.nextDouble();

                System.out.println("Digite o número do produto: ");
                f.numero = sc.nextInt();

                System.out.println("Digite a descrição do produto: ");
                f.descricao = sc.next();

                if (f.descricao.length() < 10) {
                    System.out.println("Descreva o produto com 10 caracteres");
                    break;
                }
                f.preco += f.preco;
            }
            System.out.println("O valor total da fatura é: " + f.getTotalFatura());
            sc.close();
        }

        catch (Exception e){
            System.out.println("Error ao tentar cadastrar o produto!!");
        }
    }
}
