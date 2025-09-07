import java.util.Scanner;

public class FatorialR {
    public static void main(String[] args) {
        int n, fat;
        Scanner leitor = new Scanner(System.in);

        System.out.print("Valor: ");
        n = leitor.nextInt();

        fat = fatorial(n);

        System.out.println(n + "! = " + fat);

        leitor.close();
    }

    public static int fatorial(int n) {
        if (n == 0) return 1;
        return n * fatorial(n - 1);
    }
}