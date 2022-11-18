package Grade;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de funcionarios da empresa: ");
        int nt = sc.nextInt();
        double salario = 0,s1=0;
        for (int i = 0; i <nt ; i++) {
            System.out.println("Digite o salario dos funcionarios da empresa");
            salario = sc.nextDouble();
            s1 +=salario;

        }

        double media = s1/nt;

        System.out.println("A media de salarios da empresa é de: " +media);
        sc.close(); 
    }
}
