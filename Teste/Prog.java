package Teste;

import java.util.Locale;
import java.util.Scanner;

public class Prog {
    static double balance = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Vai depositar? ");
        int op = sc.nextInt();
        if (op==1){
            System.out.println("Digite seu valor: ");
            double deposito = sc.nextDouble();
            Depositoini(deposito);
        }
        System.out.println(balance);
        sc.close();
    }

    public static double Depositoini(double deposito1){
        return  balance += deposito1;
    }

}