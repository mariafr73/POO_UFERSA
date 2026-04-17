import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número de 3 dígitos (CDU): ");
        int numero = leitor.nextInt();

        int centena = numero / 100;
        int dezena = (numero / 10) % 10;
        int unidade = numero % 10;

        int novoNumero = (unidade * 100) + (centena * 10) + dezena;

        System.out.println("Número original (CDU): " + numero);
        System.out.println("Número reescrito (UCD): " + novoNumero);

        leitor.close();
    }
}