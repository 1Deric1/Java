package exeAlura;

import java.util.Locale;
import java.util.Scanner;

public class Exe {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String nome = sc.next();
        double salario = sc.nextDouble();
        double vendas = sc.nextDouble();
        System.out.printf("TOTAL = %.2f\n",calc(salario,vendas));
        sc.close();
    }
    public static double calc(double salario, double vendas){
        return vendas*0.15+salario;
    }
}
