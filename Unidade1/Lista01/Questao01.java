import java.util.Scanner;

public class Questao01{
    public static void main(String[] args) {
        double l;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe o valor de um lado do quadrado: ");
        l = leitor.nextDouble();
        double area = l * l;
        System.out.println("A área do quadrado é: " + area);
        leitor.close();
    }
}