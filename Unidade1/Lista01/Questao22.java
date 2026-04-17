import java.util.Scanner;

public class Questao22 {
    public static int polinomio(int n, int[] coef, int x) {
        if (n == 0) return coef[0];
        return x * polinomio(n - 1, coef, x) + coef[n];
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o grau n do polinômio: ");
        int n = leitor.nextInt();

        int[] coef = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            System.out.print("Digite o coeficiente a" + i + ": ");
            coef[i] = leitor.nextInt();
        }

        System.out.print("Digite o valor de x: ");
        int x = leitor.nextInt();

        int resultado = polinomio(n, coef, x);
        System.out.println("Pn(x) = " + resultado);

        leitor.close();
    }
}