import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        int prod = numero1 * numero2;
        System.out.println("PROD = " + prod);
    }
}
