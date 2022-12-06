package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Lista{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        char esc;
        int esc1=0;
        List<String> list= new ArrayList<>();

        System.out.println("Digite algo: ");
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextLine());
        }

        System.out.println(list.size());

        System.out.println("Dejesa remover?, Deseja atualizar? ou Adicionar? ");
        esc = sc.nextLine().charAt(0);

        if(esc == 'r' ){
            System.out.println("Enter position: ");
            esc1 = sc.nextInt();
            list.remove(esc1);
        }

        else if(esc == 'u'){

            list.removeAll(list);
            System.out.println("Digite algo: ");

            for (int i = 0; i < 5; i++) {
                list.add(sc.nextLine());
            }
        }

        else if(esc == 'a'){
            System.out.println("Digite quantos numeros vc quer add: ");
            int n = sc.nextInt();

            System.out.println("Digite os numeros a serao add: ");
            for (int i = 0; i < n; i++) {
                list.add(sc.nextLine());
            }
        }
        else{
            System.out.println("Error");
        }

        System.out.println("O tamanho da sua lista é "+list.size());
        System.out.println("_________________________");
        System.out.println("E os elemetos são: "+list);

        sc.close();
    }
}
