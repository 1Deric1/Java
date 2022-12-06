package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exelist {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<ExeCdf> list = new ArrayList<>();

        try {
            System.out.println("Digite seu numero: ");
            int n = sc.nextInt();
            for (int i = 0; i <n ; i++) {
                System.out.printf("Emplyoee #%d:\n",i+1);
                System.out.println("Id: ");
                Integer id = sc.nextInt();

                System.out.println("Name: ");
                String name = sc.next();

                System.out.println("Salary: ");
                Double salary = sc.nextDouble();

                ExeCdf emp = new ExeCdf();
                list.add(emp);

            }
            System.out.println("Enter the employee id that will have salary increase: ");
            int idsallary = sc.nextInt();

        }
        catch (Exception e){
            System.out.println("Error tente novamente");
        }
        sc.close();
    }
}
