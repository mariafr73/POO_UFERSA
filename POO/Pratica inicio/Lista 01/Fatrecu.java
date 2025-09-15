import java.util.Scanner;

public class Fatrecu {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um valor n: ");
        int n = leitor.nextInt();

        imprimirFatorial(0, n, 0);
        leitor.close();
    }

    // Função recursiva que imprime os fatoriais com \t alinhados
    public static void imprimirFatorial(int atual, int n, int nivel) {
        String tabs = "\t".repeat(nivel);
        int resultado = calculaFatorial(atual);

        System.out.println(tabs + atual + "! = " + resultado);

        if (atual < n) {
            imprimirFatorial(atual + 1, n, nivel + 1);
        }
    }

    // Função recursiva auxiliar só para calcular o valor do fatorial
    public static int calculaFatorial(int k) {
        if (k == 0 || k == 1) return 1;
        return k * calculaFatorial(k - 1);
    }
}