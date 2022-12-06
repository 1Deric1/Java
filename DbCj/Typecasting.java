package DbCj;

import java.util.Locale;
import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        int k = (int) n;
        System.out.println(k);
        sc.close();
    }
}
