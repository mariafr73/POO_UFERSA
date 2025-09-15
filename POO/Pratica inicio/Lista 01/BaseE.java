import java.util.Scanner;

public class BaseE {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe a base: ");
        int base = leitor.nextInt();

        System.out.print("Informe o expoente: ");
        int expoente = leitor.nextInt();

        if (expoente < 1) {
            System.out.println("Erro: o expoente deve ser maior ou igual a 1!");
        } else {
            System.out.println(base + "^" + expoente + " = " + potencia(base, expoente));
        }

        leitor.close();
    }

    public static int potencia(int base, int expoente) {
        if (expoente == 1) {
            return base;
        }
        return base * potencia(base, expoente - 1);
    }
}
