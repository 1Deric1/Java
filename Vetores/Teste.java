package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter leght ");
        int tam = sc.nextInt();
        int[] idade = new int[tam];

        for (int i=0;i<tam;i++) {
            System.out.println("Enter a number: ");
            idade[i] = sc.nextInt();
        }

        for (int i = 0; i<tam ; i++) {
            System.out.println(idade[i]);
        }

    }
}
