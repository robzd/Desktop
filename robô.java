import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int p = 0;
        int sameas = 0;
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            for (int j = 0; j < n; j++) {
                String comando = scan.nextLine();
                if (comando == "LEFT") {
                    p -= 1;
                } else if (comando == "RIGHT") {
                    p += 1;
                } else {
                    sameas = comando.charAt(comando.length() - 1);
                }
            }
        }
    }
}