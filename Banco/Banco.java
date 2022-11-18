package Banco;

import EntitiesBanco.CdfB;

import java.util.Locale;
import java.util.Scanner;

public class Banco{
    public static void main(String[] args) {
        CdfB c;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("enter account number: ");
        int number = sc.nextInt();
        System.out.print("enter account holder: ");
        String holder = sc.next();
        sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);

        if (response == 'y'){
            System.out.print("Enter initial value: ");
            double inicialDeposit = sc.nextDouble();

            c = new CdfB(number,holder,inicialDeposit);

        }
        else {
            c =  new CdfB(number,holder);
        }

        System.out.println("Account data: ");
        System.out.println(c);
        sc.close();
    }
}