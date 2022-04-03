import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        int resposta = numero1+numero2;
        System.out.println("X = " + resposta);
    }
}
