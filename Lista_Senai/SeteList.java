package Lista_Senai;

import java.util.Locale;
import java.util.Scanner;

public class SeteList {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n= sc.nextInt();

        System.out.println("Digite outro numero: ");
        int n1= sc.nextInt();

        if(n>n1){
            System.out.println(n+" é maior que "+n1);
        } else if (n==n1) {
            System.out.println("Sao iguais!!");
        } else {
            System.out.println(n+" é menor que "+n1);
        }
    }
}
