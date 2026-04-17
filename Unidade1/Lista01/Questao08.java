import java.util.Scanner;

public class Questao08 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o código do setor (111 ou 222): ");
        int codigo = leitor.nextInt();

        System.out.print("Digite o valor original do produto: ");
        double valorOriginal = leitor.nextDouble();

        double valorComDesconto;
        String setor;

        if (codigo == 222) {
            setor = "Eletros";
            if (valorOriginal > 500) {
                valorComDesconto = valorOriginal * 0.9; // 10% de desconto
            } else {
                valorComDesconto = valorOriginal; // sem desconto
            }
            System.out.println("Setor: " + setor);
            System.out.println("Valor com desconto: R$ " + valorComDesconto);

        } else if (codigo == 111) {
            setor = "Cama, mesa e banho";
            if (valorOriginal > 100) {
                valorComDesconto = valorOriginal * 0.6; // 40% de desconto
            } else if (valorOriginal >= 50) {
                valorComDesconto = valorOriginal * 0.8; // 20% de desconto
            } else {
                valorComDesconto = valorOriginal * 0.9; // 10% de desconto
            }
            System.out.println("Setor: " + setor);
            System.out.println("Valor com desconto: R$ " + valorComDesconto);

        } else {
            System.out.println("Setor Inválido");
        }

        leitor.close();
    }
}