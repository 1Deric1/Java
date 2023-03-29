package Senai.Aula1;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Integer n = 0;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
        int n1 = 0;
        System.out.println("TABUADA DE "+n+" MULTIPLICAÇÂO");
        for (int i = 0; i < 11; i++) {
            System.out.printf("%d * %d = %d\n",n,n1++,(n*i));
        }
        System.out.println("\n");
        System.out.println("TABUADA DE "+n+" SUBTRAÇÂO");
        n1=0;
        for (int i = 0; i < 11; i++) {
            System.out.printf("%d - %d = %d\n",n1++,n,(i-n));
        }
        System.out.println("\n");
        System.out.println("TABUADA DE "+n+" ADIÇÂO");
        n1=0;
        for (int i = 0; i < 11; i++) {
            System.out.printf("%d + %d = %d\n",n1++,n,(i+n));
        }
        System.out.println("\n");
        System.out.println("TABUADA DE "+n+" DIVISÂO");
        n1=0;
        for (int i = 0; i < 11; i++) {
            System.out.printf("%d / %d = %d\n",n1++,n,(i/n));
        }
        sc.close();
    }
}
