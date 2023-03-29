package Lista_Senai;

import java.util.Locale;
import java.util.Scanner;

public class Terceirolista {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*Crie um algoritmo usando While que solicite ao usuário a entrada de N números inteiros e positivos, no final
        exiba o menor e o maior número digitado.*/
        int na = 0, nu=0;
        while (0==0){
            System.out.println("Digite um numero: ");
            nu = sc.nextInt();
            System.out.println("Digite outro numero: ");
            na = sc.nextInt();
            if (nu>na){
                System.out.println("O maior numero foi "+nu);
            }
            else {
                System.out.println("O maior numero foi "+na);
            }
        }
    }
}
