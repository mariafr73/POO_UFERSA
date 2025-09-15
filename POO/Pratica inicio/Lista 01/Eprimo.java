import java.util.Scanner;

public class Eprimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número para verificar se é primo: ");
        int numero = scanner.nextInt();
        
        boolean resultado = isPrimo(numero, 2);
        
        if (resultado) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

        System.out.println(resultado);
        
        scanner.close();
    }

    public static boolean isPrimo(int n, int divisor) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        if (divisor > Math.sqrt(n)) return true;
        if (n % divisor == 0) return false;
        return isPrimo(n, divisor + 2);
    }
}