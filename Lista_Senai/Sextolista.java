package Lista_Senai;

import java.util.Scanner;

public class Sextolista{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String candidato1, candidato2, candidato3;
        int votosCandidato1 = 0, votosCandidato2 = 0, votosCandidato3 = 0;
        int voto;

        System.out.print("Digite o nome do primeiro candidato: ");
        candidato1 = sc.nextLine();
        System.out.print("Digite o nome do segundo candidato: ");
        candidato2 = sc.nextLine();
        System.out.print("Digite o nome do terceiro candidato: ");
        candidato3 = sc.nextLine();

        do {
            System.out.println("Votar em:");
            System.out.println("1 - " + candidato1);
            System.out.println("2 - " + candidato2);
            System.out.println("3 - " + candidato3);
            System.out.println("0 - Sair");
            System.out.print("Digite o número do candidato ou 0 para sair: ");
            voto = sc.nextInt();
            switch (voto) {
                case 1:
                    votosCandidato1++;
                    System.out.println("Voto registrado em " + candidato1);
                    break;
                case 2:
                    votosCandidato2++;
                    System.out.println("Voto registrado em " + candidato2);
                    break;
                case 3:
                    votosCandidato3++;
                    System.out.println("Voto registrado em " + candidato3);
                    break;
                case 0:
                    System.out.println("Votação encerrada");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (voto != 0);

        System.out.println("Resultado da eleição:");
        System.out.println(candidato1 + ": " + votosCandidato1 + " votos");
        System.out.println(candidato2 + ": " + votosCandidato2 + " votos");
        System.out.println(candidato3 + ": " + votosCandidato3 + " votos");

        if (votosCandidato1 > votosCandidato2 && votosCandidato1 > votosCandidato3) {
            System.out.println(candidato1 + " venceu a eleição.");
        } else if (votosCandidato2 > votosCandidato1 && votosCandidato2 > votosCandidato3) {
            System.out.println(candidato2 + " venceu a eleição.");
        } else if (votosCandidato3 > votosCandidato1 && votosCandidato3 > votosCandidato2) {
            System.out.println(candidato3 + " venceu a eleição.");
        } else {
            System.out.println("Houve empate na eleição.");
        }
    }
}
