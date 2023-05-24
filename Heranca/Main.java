package Heranca;

import Heranca.Account.Account;
import Heranca.Business.BusinessAccount;
import Heranca.Savings.SavingsAccount;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Account acc = new Account(100,"Alex",0.0);
        BusinessAccount bcc = new BusinessAccount(1002,"MAria", 0.0, 500.0);
        //upscating
        Account acc1 = bcc;
        Account acc2 = new BusinessAccount(1003,"Bob",0.0,200.0);
        Account acc3 = new SavingsAccount(104,"Anna",0.0,0.01);
        //DownCasting
        BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.loan(100.0);
        //BusinessAccount acc5 = (BusinessAccount)acc3;
        if (acc3 instanceof  BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(200.0);
            System.out.println("Loan");
        }
        if (acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update");
        }
    }
}
