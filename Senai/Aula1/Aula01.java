package Senai.Aula1;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class Aula01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Se cadastre: ");
        String user_c = sc.next();
        System.out.println("Se cadastre: ");
        String senha_c = sc.next();

        System.out.println("User: ");
        String user_d = JOptionPane.showInputDialog(null,"User");
        System.out.println("Senha: ");
        String senha_d = JOptionPane.showInputDialog(null,"Senha");

        if (user_c.equals(user_d)  && senha_c.equals(senha_d)){
            JOptionPane.showConfirmDialog(null,"Logado");
        }
        else{
            System.out.println("erro");
        }
        sc.close();
    }
}
