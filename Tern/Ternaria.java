package Tern;

import java.util.Locale;
import java.util.Scanner;

public class Ternaria {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int s = 1;
        String r = i>=s? "é maior ou igual" :"é menor";
        System.out.println(r);
        sc.close();
    }
}
