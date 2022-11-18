package ExeVect;

import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n=0,i=0;
        double soma=0,media=0;

        System.out.println("Digite o tamanho do seu vetor");
        n = sc.nextInt();

        double [] vect = new double[n];
        for (i = 0; i < n; i++) {
            System.out.println("Digite um numero: ");
            vect[i] = sc.nextDouble();
            soma += vect[i];
            media = soma/n;
        }
        System.out.print("Valores = ");
        for (i = 0; i < n; i++) {
            System.out.print(vect[i]+" ");
        }
        System.out.println("\nSOMA = "+soma);
        System.out.println("MÉDIA = "+media);
        sc.close();
    }
}
