import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite as coordenadas do primeiro ponto (x1 y1): ");
        double x1 = leitor.nextDouble();
        double y1 = leitor.nextDouble();

        System.out.print("Digite as coordenadas do segundo ponto (x2 y2): "); 
        double x2 = leitor.nextDouble();
        double y2 = leitor.nextDouble();

        if (y2 > y1) {
            System.out.println("O segundo ponto está acima do primeiro.");
        } else if (y2 < y1) {
            System.out.println("O segundo ponto está abaixo do primeiro.");
        } else {
            System.out.println("O segundo ponto está na mesma altura do primeiro.");
        }

        if (x2 > x1) {
            System.out.println("O segundo ponto está à direita do primeiro.");
        } else if (x2 < x1) {
            System.out.println("O segundo ponto está à esquerda do primeiro.");
        } else {
            System.out.println("O segundo ponto está alinhado verticalmente com o primeiro.");
        }

        leitor.close();
    }
}