package Deposit;

import java.util.Locale;
import java.util.Scanner;

public class Prog {
    static double balance = 50;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Vai depositar? ou sacar? ");
        int op = sc.nextInt();
        while (op!=0) {
            if (op == 1) {
                System.out.println("Digite seu valor: ");
                double deposito = sc.nextDouble();
                Depositoini(deposito);
            }
            if (op == 2) {
                System.out.println("Digite seu valor: ");
                double withdraw = sc.nextDouble();
                Withdraw(withdraw);
            }
            System.out.println(balance);
        }
        sc.close();
    }

    public static double Depositoini(double deposit) {
        return balance += deposit;
    }
    public static double Withdraw(double amount){
        return balance -= amount - 0.5;
    }
}