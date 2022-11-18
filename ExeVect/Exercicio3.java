package ExeVect;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        String[] nome = new String[n];
        double [] altura = new double[n];
        int [] idade =new int[n];
        double media = 0;
        int menores=0,k=0;;
        for (int i = 0; i < n; i++) {
            k++;
            System.out.println("Dados da "+k+"pessoa");
            System.out.println("Nome: ");
            nome[i] = sc.next();
            System.out.println("Idade: ");
            idade[i] = sc.nextInt();
            System.out.println("Altura: ");
            altura[i]  = sc.nextDouble();
            media =media +altura[i];
            if (idade[i] <16){
                menores++;
            }
        }

        media = media/n;
        double porcentagem = ((double) menores / n) * 100.0;
        System.out.println("Altura média "+media);
        System.out.println("Pessoas com menos de 16 anos: "+porcentagem+"%");

        for (int i = 0; i < n; i++) {
            if (idade[i] <16){
                System.out.println(nome[i]);
            }
        }
        sc.close();
    }
}
