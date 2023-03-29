package Lista_Senai;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class User {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        /*Crie um algoritmo que solicite ao usuário que digite 3 nomes e no final imprima o total de nomes que come-
          çam com a primeira letra com uma vogal e o total de nomes que começam com a primeira letra com uma conso-
          ante.*/
        ArrayList<String> list = new ArrayList<>();
        for (int i= 0; i<3; i++) {
            System.out.println("Digite um nome: ");
            list.add(sc.next());
        }

        System.out.println("Digite2 a letra a ser encontrada: ");
        Character seach = sc.next().charAt(0);

        List<String> list1 = list.stream().sorted().filter(x-> x.charAt(0) == seach).collect(Collectors.toList());
        for (String x : list1) {
            System.out.println("Pessoa encontrada: "+x);
        }
        
        sc.close();
    }
}
