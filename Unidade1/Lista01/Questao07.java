import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = leitor.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = leitor.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = leitor.nextInt();

        int menor;

        if (num1 <= num2 && num1 <= num3) {
            menor = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            menor = num2;
        } else {
            menor = num3;
        }

        System.out.println("O menor número é: " + menor);

        leitor.close();
    }
}