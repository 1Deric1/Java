package LacoForEach;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[2];

        for (int x:a) {
            a[x] = sc.nextInt();
            System.out.println(a[x]);
        }

        sc.close();
    }
}
