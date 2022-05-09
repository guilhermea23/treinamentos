package Java;

import java.util.Scanner;

public class Fatorial {
    public static int fat(int n){
        if (n<2) {
            return 1;
        } else {
            return n*fat(n-1);
        }
        
    }
    public static void main(String[] args) {
        int n;
        int res;
        try (Scanner scan = new Scanner(System.in)) {
            n= scan.nextInt();
            res = fat(n);
            System.out.println("Fatorial de "+n+" = "+res);
        }
    }
}
