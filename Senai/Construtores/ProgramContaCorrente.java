package Senai.Construtores;

import java.util.Locale;
import java.util.Scanner;

public class ProgramContaCorrente {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Funcionarios fun = new Funcionarios("Luis","Silva",10,25.50);
        System.out.println(fun.nomeCompleto());
        fun.incrementarhora(8);
        System.out.println(fun.Calcularsalario());

        sc.close();
    }
}
