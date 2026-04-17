import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor de n: ");
        int n = leitor.nextInt();

        int a = 0, b = 1;
        System.out.print("Série de Fibonacci: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }

        leitor.close();
    }
}