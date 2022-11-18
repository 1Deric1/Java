package ExeVect;

import java.util.Locale;
import java.util.Scanner;

public class Soma_dos_vects {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = 0, i =0;
        System.out.println("Quantos valores vai ter cada vetor? ");
        n = sc.nextInt();
        int [] vectA = new int[n];
        for (i = 0; i <n ; i++) {
            System.out.println("Digite os valores do vetor A: ");
            vectA[i] = sc.nextInt();
        }
        int [] vectB = new int[n];
        for (i = 0; i < n ; i++) {
            System.out.println("Digite os valores do vetor B: ");
            vectB[i]  = sc.nextInt();
        }
        int [] vectC = new int[n];
        for (i = 0 ;i<n;i++) {
            vectC[i] = vectA[i] + vectB[i];
            System.out.println(vectC[i]);
        }

        sc.close();
    }
}
