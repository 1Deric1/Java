package Lista_Senai;

import java.util.Scanner;

public class Quintolista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n = sc.nextInt();

        do {

            if (n>0){
                System.out.println("Positivo");
            }
            else {
                System.out.println("Negativo");
            }
            System.out.println("Digite um numero: ");
            n = sc.nextInt();
        }while (n!=0);
        sc.close();
    }
}
