package Lista_Senai;

import java.util.Random;
import java.util.Scanner;

public class Quartolista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 0;

        Random r = new Random();
        int a = r.nextInt(0,100);

        while (0==0){
            System.out.println("Digite um numero: ");
            Integer n = sc.nextInt();
            if (a==n){
                t++;
                System.out.println("Acertou!!");
                System.out.println("Total de tentativas é "+t);
                break;
            }
            else{
                t++;
                System.out.println("Tente Novamente!!");
                if (n>a){
                    System.out.println("Seu numero é maior q "+n);
                }
                else {
                    System.out.println("Seu numero e menor q "+n);
                }
            }
        }

    }
}
