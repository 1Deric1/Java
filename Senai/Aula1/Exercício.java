package Senai.Aula1;

import java.util.Locale;
import java.util.Scanner;

public class Exercício {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n=0,i=0,p=0;
        while(n>=0){
            System.out.println("Digite um numero: ");
            n= sc.nextInt();
            if (n%2==0){
                p++;
            }
            else {
                i++;
            }
        }
        System.out.println("Total de numeros pares "+p);
        System.out.println("Total de numeros impares "+i);

        sc.close();
    }
}
