package Senai.Aula1;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicional {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Integer n= 0;
        while (n>=0){
            n = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
            if (n>=1 && n<6) {
                break;
            }
        }
        sc.close();
    }
}
