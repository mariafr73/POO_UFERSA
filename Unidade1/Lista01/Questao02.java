import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Double num1, num2, num3;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        num1 = leitor.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = leitor.nextDouble();

        System.out.print("Digite o terceiro número: ");
        num3 = leitor.nextDouble();

        double soma = num1 + num2 + num3;
        double media = soma / 3;

        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média aritmética é: " + media);

        leitor.close();

    }
}