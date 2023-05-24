package Discord;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String nome = null;
        int mulher = 0, homem = 0;
        char sexo;
        for (int i = 0; i < 5; i++) {
            System.out.println("Seu nome: ");
            nome = sc.next();

            System.out.println("Qual seu sexo? ");
            sexo = sc.next().charAt(0);
            if (sexo == 'M' || sexo == 'm'){
                homem ++;
            }
            else if (sexo == 'F' || sexo  == 'f'){
                mulher ++;
            }
        }
        for (int i = 0; i < 1; i++) {
            System.out.println("Mulheres "+mulher+" Homens: "+ homem);
        }
        sc.close();
    }
}
