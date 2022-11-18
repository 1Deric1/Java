package ProgramVet;

import EntitiesVet.CdftVet;

import java.util.Locale;
import java.util.Scanner;

public class Vet {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int tam = sc.nextInt();
        CdftVet[] vect = new CdftVet[tam];

        for (int i = 0; i < tam; i++) {
            String name = sc.next();
            double price = sc.nextDouble();
            //vect[i] aponta no heap que dentro do vetor tem uma referencia ali
            vect[i] = new CdftVet("nome",price);
        }

        double media = 0.0;
        for (int i = 0; i < tam ; i++) {
            //get price acesa a posicao pegando apenas o preco do objeto
            media+=vect[i].getPrice();
        }

        double media1 = media/tam;
        System.out.printf("AVERAGE PRICE = %.2f%n",media1);
        sc.close();
    }

}
