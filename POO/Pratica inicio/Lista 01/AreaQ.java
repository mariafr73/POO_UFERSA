import java.util.Scanner;

public class AreaQ {
    public static void main(String[] args) {
        float n, a;
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe um lado do quadrado: ");
        n = leitor.nextFloat();

        a = n * n;

        System.out.println("A área do quadrado é: " + a);

        leitor.close();
    }
}