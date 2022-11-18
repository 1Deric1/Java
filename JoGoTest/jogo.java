package JoGoTest;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class jogo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("Deseja começar?[s][n] ");
        char esc = sc.next().charAt(0);

        if (esc == 'n'){
            System.out.println("Nao começou");
        } else if (esc == 's') {
            System.out.println("iniciando............");
            System.out.println("Digite uma opção para jogar");
            System.out.println("Para saber como funcionara digite [q]");
            char regras = sc.next().charAt(0);

            if (regras == 'q') {
                System.out.println("Voce apenas precisa acertar o " +
                        "numero que vai" +
                        " gerar a cada acerto você " +
                        "ganha um ponto");
            }
            System.out.println("tente acertar....");
            System.out.println("Digite um número: ");
            n = sc.nextInt();

        }

        sc.close();
    }
    public static int numeroAleatorios(int nume ){

        for (int i = 0; i < 1; i++) {
            Random r = new Random();
                nume = r.nextInt(10);
        }
        return nume;
    }
}
