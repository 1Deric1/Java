package Senai.Aula1;

import java.util.Locale;
import java.util.Scanner;

public class Positivo {
    /*Crie um algoritmo que solicite um número inteiro positivo ao usuário
    e no final imprima os números ímpares do 1 até o numero que o
    usuário digitou.*/
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if(i%2!=0){
                System.out.println(i);
            }
            else if (i==n && n<0) {
                break;
            }
        }
        sc.close();
    }
}
