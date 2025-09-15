import java.util.Scanner;

public class Mdc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de m: ");
        int m = sc.nextInt();

        System.out.print("Digite o valor de n: ");
        int n = sc.nextInt();

        System.out.println("MDC(" + m + ", " + n + ") = " + mdc(m, n));

        sc.close();
    }

    public static int mdc(int m, int n) {
        if (n > m) {
            return mdc(n, m); // garante que m sempre >= n
        } else if (n == 0) {
            return m; // caso base
        } else {
            return mdc(n, m % n); // passo recursivo
        }
    }
}
