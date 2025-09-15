import java.util.Scanner;

public class Cartesiano {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe x do primeiro ponto: ");
        int x1 = leitor.nextInt();
        System.out.print("Informe y do primeiro ponto: ");
        int y1 = leitor.nextInt();

        System.out.print("Informe x do segundo ponto: ");
        int x2 = leitor.nextInt();
        System.out.print("Informe y do segundo ponto: ");
        int y2 = leitor.nextInt();

        String vertical, horizontal;

        // Comparação vertical
        if (y2 > y1) {
            vertical = "acima do primeiro";
        } else if (y2 < y1) {
            vertical = "abaixo do primeiro";
        } else {
            vertical = "na mesma altura do primeiro";
        }

        // Comparação horizontal
        if (x2 > x1) {
            horizontal = "à direita do primeiro";
        } else if (x2 < x1) {
            horizontal = "à esquerda do primeiro";
        } else {
            horizontal = "na mesma posição horizontal do primeiro";
        }

        // Imprime em uma frase só
        System.out.println("O segundo ponto está " + vertical + " e " + horizontal + ".");

        leitor.close();
    }
}
