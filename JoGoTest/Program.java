package JoGoTest;

import java.util.Random;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int ra =0;

        for (int i = 0; i <1; i++) {
            ra = r.nextInt(26);
        }

        System.out.println("Digite um número: ");
        int user = sc.nextInt();

        System.out.println(ra);
        if (user == ra) {
            System.out.println("Voce Acertou");
        }
        else {
            System.out.println("Errou");
        }
        sc.close();
    }
}
