package ExeVect;

import java.util.Locale;
import java.util.Scanner;

public class elemts {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n,i;
        double media = 0;
        System.out.println("Digite a quantidades de numeros: ");
        n = sc.nextInt();
        double [] vect = new double[n];
        for (i = 0;  i < n ; i++) {
            System.out.println("Digite um numero: ");
            vect[i] = sc.nextDouble();
            media += vect[i] /n;
        }
        System.out.println("MEDIA DO VETOR = "+media);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
        for (i = 0;  i < n ; i++) {
            if (media > vect[i]){
                System.out.println(vect[i]);
            }
        }
        sc.close();
    }
}
