package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StListas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list =new ArrayList<>();
        //list.add(sc.next());
        list.add("Mario");
        list.add("Maria");
        list.add("Alex");
        list.add("Junior");
        list.add("Deric");

        System.out.println(list.size());
        for (String x: list) {
            System.out.println(x);
        }

        System.out.println("____________REMOVER TODOS QUE COMEÇAM COM A LETRA M____________");
        list.removeIf(x -> x.charAt(0) == 'M');
        for (String x: list) {
            System.out.println(x);
        }
//        list.remove("Alex");
        System.out.println("____________ACHAR A POSIÇÂO____________");
        System.out.println("Index of Deric "+list.indexOf("Deric"));
        System.out.println("Index of Alex "+list.indexOf("Alex"));

        System.out.println("____________FILTRAR____________");
        List<String> result =list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x: result) {
            System.out.println(x);
        }
        System.out.println("____________PEGAR O PRIMEIRO ELE QUE COMEÇA COM D____________");
        String name = list.stream().filter(x -> x.charAt(0) == 'D').findFirst().orElse(null);
        for (String x: result) {
            System.out.println(name);
        }
        sc.close();
    }
}
