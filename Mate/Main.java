package Mate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int t = (int) Math.pow(x,y);
        System.out.println(t);
        sc.close();
    }
}
