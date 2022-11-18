package Vlata;

import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double  V;
        double R =  3.2;
        double A = 4.9;
        V = 3.14159 * R * R * A;
        System.out.printf("O volume da lata de oleo é de %.2f m3",V);
    }
}
