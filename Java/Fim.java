package Java;
import java.util.Scanner;
public class Fim {
    public static void main(String[] args) {
        String a,b;
        try (Scanner scan = new Scanner(System.in)) {
            a = scan.nextLine();
            b = scan.nextLine();
        }
        if (a.endsWith(b)){
            System.out.println(b+" está no final de "+a);
        } else {
            System.out.println(b+" não está no final de "+a);
        }
    }
}