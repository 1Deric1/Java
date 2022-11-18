package Matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Estudo1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Integer j,i;
        System.out.println("Digite o tamanho da sua matriz: ");
        Integer n = sc.nextInt();
        Integer[][] vect = new Integer[n][n];

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                 vect[i][j] = sc.nextInt();
            }
        }

        System.out.println("__________________________________________");

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.println(vect[0][1]);
            }
        }

        sc.close();
    }
}
