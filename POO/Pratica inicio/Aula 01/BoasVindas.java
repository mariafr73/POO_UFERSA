import java.util.Scanner;

public class BoasVindas {
    public static void main(String[] args) {
        String nome;
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        nome = leitor.next();

        System.out.println("Bem Vindo(a), " + nome);

        leitor.close();
    }
}