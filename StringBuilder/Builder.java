package StringBuilder;

import java.util.Locale;
import java.util.Scanner;

public class Builder {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        sb.append("Deric ").append("Joao ").append("Alef ");
        System.out.println(sb.toString());

        sc.close();
    }
}
