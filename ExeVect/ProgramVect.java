package ExeVect;

import java.util.Locale;
import java.util.Scanner;

public class ProgramVect{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do seu vetor: ");
        int n = sc.nextInt();
        //declaracao de vetor
        int[]  vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (vetor[i]< 0) {
                System.out.println(vetor[i]);
            }
        }
        sc.close();
    }

}
