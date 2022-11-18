package ExeVect;

import java.util.Locale;
import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros vc vai digitar: ");
        int n = sc.nextInt();
        int[] vetor = new int[n];
        int j=0;
        for (int i = 0; i <n ; i++) {
            System.out.println("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }
        System.out.println("Números Pares: ");
        for (int i = 0; i < n; i++) {
            if (vetor[i]%2==0) {
                j++;
                System.out.print(vetor[i]+" ");
            }
        }
        System.out.println("\nQuantidade de pares = "+j);
        sc.close();
    }
}
