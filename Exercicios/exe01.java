package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exe01 {
    /*2. Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas. Fazer um algoritmo que calcule e escreva:
    a. a maior e a menor altura do grupo;
    b. média de altura dos homens;
    c. o número de mulheres.*/

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int mulher=0,homem=0,sexo=0;
        double altura=0,som=0,maior=0,menor=0,media=0;


        for (int i = 0; i < 10; i++) {
            System.out.println("Digite (1 mulher/2homem): ");
            sexo = sc.nextInt();

            System.out.println("Digite sua altura: ");
            altura = sc.nextDouble();


            if (sexo ==1){
                mulher++;
            }

            else if(sexo ==2){
                homem++;
                som =som +altura;

            }
            else {
                System.out.printf("Digite um valor valido");
            }
            if (altura>maior){
                maior=altura;
            }

            else if (altura>menor) {
                menor = altura;
            }

        }

        media = som/homem;

        System.out.println("A maior altura do grupo é de " + maior + " m, e a menor é de " + menor + " m");
        System.out.println("A média de altura dos homens é " + media + " m");
        System.out.println("O número de mulheres é " + mulher);

        sc.close();
    }
}
