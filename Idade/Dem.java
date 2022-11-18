package Idade;
import java.util.Scanner;
public class Dem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vc é de maior (s/n): ");
        char idade = sc.next().charAt(0);
        if(idade=='s') {
            System.out.println("Vc é de maior");
        }
        else if( idade == 'n'){
            System.out.println("Vc é de menor");
        }
    }
}
