package Heranca;

import Senai.Construtores.Funcionarios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Func1 f = new Func1("Deric",7858,'s',17);
        Gerente g =new Gerente("Diogo",8778,'m',17);

        System.out.println("Digite seu nome: ");
        f.nome = sc.next();

        System.out.println("Digite sua idade: ");
        f.idade = sc.nextInt();

        System.out.println("Digite seu cpf: ");
        f.Cpf = sc.nextInt();

        System.out.println("Digite seu sexo: ");
        f.sexo = sc.next().charAt(0);

        System.out.println("_________GERENTE____________");

        System.out.println("Digite seu nome: ");
        g.nome = sc.next();

        System.out.println("Digite sua idade: ");
        g.idade = sc.nextInt();

        System.out.println("Digite seu cpf: ");
        g.Cpf = sc.nextInt();

        System.out.println("Digite seu sexo: ");
        g.sexo = sc.next().charAt(0);

        System.out.println("Funcionarios tem os seguintes dados: ");
        System.out.println(f.nome+" "+f.idade+" "+f.Cpf+" "+f.sexo);
        System.out.println("_____________________________________");
        System.out.println("Gerentes tem os seguintes dados: ");
        System.out.println(g.nome+" "+g.idade+" "+g.Cpf+" "+g.sexo);

        sc.close();
    }
}
