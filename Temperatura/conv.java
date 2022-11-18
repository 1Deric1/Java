package Temperatura;

import java.util.Locale;
import java.util.Scanner;

public class conv {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura em celsius: ");
        double c = sc.nextInt();
        double f,k,re,ra;
        f = c*18+32;
        k=c+273;
        re=c*0.8;
        ra=c*1.8+32+459.67;

        System.out.println(String.format("%.2f",f));
        System.out.println(String.format("%.2f",k));
        System.out.println(String.format("%.2f",re));
        System.out.println(String.format("%.2f",ra));

        sc.close();
    }
}
