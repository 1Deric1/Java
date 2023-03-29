package Atividade;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Agenda a = new Agenda(2);
        String[] v = new String[a.qtd];

        int op = 0;
        while (op != 6) {
            System.out.println("Escolha uma opção:" +
                    "\nArmazenar [1]" +
                    "\nMostrar informações específicas [2]" +
                    "\nMostrar posição da pessoa [3]"+
                    "\nMostrar todas as posições [4]" +
                    "\nRemover posição [5]" +
                    "\nSair [6]\n");

            op = sc.nextInt();
            switch (op) {
                case 1:
                    for (int i = 0; i < a.qtd; i++) {
                        System.out.println("Digite seu nome: ");
                        String nome = sc.next();
                        System.out.println("Digite sua idade: ");
                        int idade = sc.nextInt();
                        System.out.println("Digite sua altura: ");
                        double altura = sc.nextDouble();
                        v[i] = a.armazenaPessoa(nome, idade, altura);
                    }
                    break;
                case 2:
                    System.out.println("Digite a posição da pessoa: ");
                    int pos = sc.nextInt();
                    for (int i = 0; i < 1; i++) {
                        System.out.println(a.mpessoa(pos));
                    }
                    break;
                case 3:
                    System.out.println("Digite a posição da pessoa: ");
                    int posicao = sc.nextInt();
                    for (int i = 0; i < 1; i++) {
                        System.out.println(a.mpessoa(posicao)+" esta na posicao "+i);
                    }
                    break;
                case 4:
                    System.out.println(a);
                    break;
                case 5:
                    System.out.println("Digite a posicao a ser apagada ");
                    int po = sc.nextInt();
                    for (int i = 0; i < 1; i++) {
                        System.out.print(a.rpessoa(po));
                    }
                    break;
                case 6:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        sc.close();
    }
}
