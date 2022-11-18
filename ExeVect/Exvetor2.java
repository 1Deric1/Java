package ExeVect;

import java.util.Locale;
import java.util.Scanner;

public class Exvetor2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int media, soma = 0;
        System.out.println("Digite o tamnho do seu vetor: ");
        int n = sc.nextInt();
        int[] vetor = new int[n];

        int i;
        for (i = 0; i < n; i++) {
            vetor[i] = sc.nextInt();
            soma += vetor[i];
        }
        media = soma / n;
        System.out.print("Valores = ");
        for (i = 0; i< n; i++) {
            System.out.printf(" %d ",vetor[i]);
        }
        System.out.println("Soma é: " + soma +" "+"E a media é: " + media);

        sc.close();
    }
}
