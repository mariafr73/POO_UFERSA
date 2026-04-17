import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = leitor.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);

        leitor.close();
    }
}