package HerançaTeste;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account acc = new Account(1,"Jonas",0.00);
        BusinessAccount bacc = new BusinessAccount(1,"Deric",14.0,15.00);

        //Upcasting
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003,"Bob",0.0,200.0);
        Account acc3 = new SavingsAccount(1004,"Alex",0.00,0.01);

        //Downcasting
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);
        //Da erro pois nao pode ser convertido para businessaccount
        //BusinessAccount acc5 = (BusinessAccount)acc3;
        if (acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if(acc3 instanceof  SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.upadteBalance(10.0);
            System.out.println("Update");
        }
        sc.close();
    }
}
