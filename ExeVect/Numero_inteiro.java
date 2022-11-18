package ExeVect;

import java.util.Locale;
import java.util.Scanner;

public class Numero_inteiro {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros você vai digitar? ");
        int n = sc.nextInt();
        int[] vect = new int[n];
        for (int i = 0; i < n; i++) {
            if (n>10){
                break;
            }
            System.out.println("Digite um número: ");
            vect[i]= sc.nextInt();
        }
        for (int i = 0; i < 1; i++) {
            System.out.println("NúMEROS NEGATIVOS: ");
        }
        for (int i = 0; i < n; i++) {
            if (vect[i]<0){
                System.out.println(vect[i]);
            }
        }
        sc.close();
    }
}
