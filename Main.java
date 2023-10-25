import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            Retangulo r1 = new Retangulo();
            System.out.println("Base: ");
            double b = scan.nextDouble();
            System.out.println("Altura: ");
            double h = scan.nextDouble();

            r1.setBase(b);
            r1.setAltura(h);
            System.out.println(r1.getBase());
            System.out.println(r1.toString());
        }
    }