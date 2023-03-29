package Senai.Aula1;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class Aluno {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double media = 0,nota =0,nota1 = 0;
        Integer n = 0;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de notas"));
        for (int i = 0; i <2; i++) {
            System.out.printf("Aluno %d\n",i+1);
            System.out.println("Digite a nota: ");
            nota = sc.nextDouble();
            System.out.println("Digite a nota: ");
            nota = sc.nextDouble();
            media = (nota+nota1) / n;
            if (media >= 6 && media <10 ) {
                System.out.println("Aprovado");
            }
            else{
                System.out.println("Reprovado");
            }
        }

        sc.close();
    }
}
