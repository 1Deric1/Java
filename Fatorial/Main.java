package Fatorial;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n = sc.nextInt();
        int r=1;
        for (int i = 1; i <= n; i++) {
            r *=i;
        }

        System.out.println("O fatorial de "+n+" é: "+r);

        sc.close();
    }
}
