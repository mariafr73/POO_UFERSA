import java.util.Scanner;

public class CDU{
    public static void main(String[] args) {
        int n;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe um número inteiro com três digitos: ");
        n = leitor.nextInt();

        int unidade = n % 10;
        int dezena = (n / 10) % 10;
        int centena = (n / 100) % 10;

        System.out.println("Centena: " + centena);
        System.out.println("Dezena: " + dezena);
        System.out.println("Unidade: " + unidade);

        System.out.println("O numero informado foi: "+ n + " e ao contrario é: " + unidade + +dezena+ +centena);

        leitor.close();
    }
}