import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe o valor de0 (n > 0): ");
        int n = leitor.nextInt();

        int a = 0, b = 1;
        System.out.print("Série de Fibonacci: ");
        for (int i = 1; i <= n; i++) {
            System.out.printf(a + "\t ");
            int proximo = a + b;
            a = b;
            b = proximo;
        }
        System.out.println();
        leitor.close();
    }
}