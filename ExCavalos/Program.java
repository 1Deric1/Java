package ExCavalos;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc =new Scanner(System.in);
        double cavalos ,m ,h , t;
        System.out.println("Digite a massa de m: ");
        m = sc.nextDouble();
        System.out.println("Digite a altura de h: ");
        h= sc.nextDouble();
        System.out.println("Digite os segundos de t: ");
        t = sc.nextDouble();
        cavalos = (m * h / t) / 745.6999;
        System.out.println("A quantidade de cavalos necessários é: "+cavalos);
        sc.close();
    }
}
