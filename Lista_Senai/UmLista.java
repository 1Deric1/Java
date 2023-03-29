package Lista_Senai;

import java.util.Scanner;

public class UmLista {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nomes = new String[3];
        int totalVogais = 0;
        int totalConsoantes = 0;

        for (int i = 0; i < 3; i++) {
            System.out.printf("Digite o nome %d: ", i+1);
            nomes[i] = input.next();
            char primeiraLetra = nomes[i].toLowerCase().charAt(0);
            if (primeiraLetra == 'a' || primeiraLetra == 'e' || primeiraLetra == 'i' || primeiraLetra == 'o' || primeiraLetra == 'u') {
                totalVogais++;
            } else {
                totalConsoantes++;
            }
        }

        System.out.printf("Total de nomes que começam com vogal: %d\n", totalVogais);
        System.out.printf("Total de nomes que começam com consoante: %d\n", totalConsoantes);
    }
}
