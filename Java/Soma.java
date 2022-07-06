package Java;

import java.util.Scanner;


public class Soma {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int x,y,soma;
            System.out.println("Entre com o valor de X: \n");
            x = scan.nextInt();
            System.out.println("Entre com o valor de Y: \n");
            y = scan.nextInt();
            soma = x + y;
            System.out.println(x + " + " + y +" = "+ soma);
        }
    }
}
