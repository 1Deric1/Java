package ExeVect;

import java.util.Locale;
import java.util.Scanner;

public class Media_pares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n=0,i=0,numerospar=0,soma=0;
        double media=0;
        System.out.println("Digite o tamanho do vetor: ");
        n= sc.nextInt();

        int [] vect = new int[n];

        for (i= 0; i < n; i++) {
            System.out.println("Digite um numero: ");
            vect[i] = sc.nextInt();
            if (vect[i] % 2 ==0){
                numerospar++;
                soma = soma+  vect[i];
            }
        }
        if (numerospar ==0){
            System.out.println("NENHUM NUMERO PAR");
        }
        else{
            //type casting para mudar o tipo da variavel
            media = ((double) soma /numerospar);
        }

        System.out.println("MEDIA DOS PARES = "+media);

        sc.close();
    }
}
