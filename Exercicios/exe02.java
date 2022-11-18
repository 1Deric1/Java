package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exe02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a base do triangulo: ");
        int base = sc.nextInt();
        System.out.println("Digite a altura do triangulo: ");
        int altura = sc.nextInt();

        int F = base*altura/2;
        System.out.printf("A area do triangulo é %d",F);

        sc.close();
    }
}
