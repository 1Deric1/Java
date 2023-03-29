package Atividade.Ligado;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Entities e = new Entities();
        int l = 0,d = 0;
        for (int i = 0; i < 3; i++) {

            String li = sc.next();
            if (li.equals("Ligar")) {
                l++;
                if (l > 1) {
                    System.out.println("Você já está em uma ligação");
                }

                else  {
                    System.out.println(e.Ligar());
                }
            }
            else if (li.equals("Desligar")){
                d++;
                if (d > 1){
                    System.out.println("Ja está Desligado");
                }
                else {
                    System.out.println(e.Desligar());
                    break;
                }
            }
        }
        sc.close();
    }
}
