package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exe03 {
    public static void main(String[] args) {
        /*
                1 - Faça um algoritimo que receba o comprimento do lado de um quadrado e calcule sua área e seu perímetro.
                Exemplo:
                Digite o lado do do quadrado:
                12
                A area do quadrado e de 144 e seu perimetro de 48
        */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o comprimento do lado do quadrado: ");
        int quadrado = sc.nextInt();
        int perimetro = quadrado *4;
            int area = quadrado *quadrado;
        System.out.println("Seu perimetro é "+perimetro
                +"e Sua area é "+area);
        sc.close();
    }
}
