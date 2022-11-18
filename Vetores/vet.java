package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class vet {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] vect = new double[n];
        //n é o tamanho do vetor
        //new double é dizendo q estou instaciando o vetorr vect fazendo ele um objeto

        double som = 0;
        for(int i =0; i<n; i++){
            vect[i]= sc.nextDouble();
            som = vect[i]+vect[i];
        }
        System.out.println(som);
    }
}
