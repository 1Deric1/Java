package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exe04 {
    public static void main(String[] args) {
        /* 3 - Gerador de usuarios. Crie um programa que receba o nome, sobrenome e ano de nascimento do usuário, e a partir disso gere um nick com as duas primeiras letras do nome, seu sobrenome
        ao contrario e os ultimos dois digitos de seu ano de nascimento tudo minusculo.
        Exemplo:
        - Maria
                - Medeiros
                - 1984
        nick gerado: masoriedem84 */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.next();
        System.out.println("Digite seu sobrenome: ");
        String scnome = sc.next();
        System.out.println("Digite seu ano de nascimento: ");
        int ano = sc.nextInt();
        System.out.printf("%s ");
        sc.close();

    }

}
