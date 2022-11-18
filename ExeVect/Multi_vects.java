package ExeVect;

import java.util.Locale;
import java.util.Scanner;

public class Multi_vects {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Quantos elementos o seu vetor vai ter? ");
        n = sc.nextInt();
        int [] vectA = new int[n];
        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < n; i++) {
            vectA[i] = sc.nextInt();
        }
        int [] vectB = new int[n];
        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < n; i++) {
            vectB[i] = sc.nextInt();
        }
        int [] vectC = new int[n];
        System.out.println("Vetor Resultante: ");
        for (int i = 0; i < n; i++) {
            vectC[i]= vectA[i] * vectB[i];
            System.out.println(vectC[i]);
        }
        sc.close();
    }
}
