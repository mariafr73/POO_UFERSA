import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o ângulo em graus: ");
        double graus = leitor.nextDouble();

        double radianos = Math.toRadians(graus);

        double seno = Math.sin(radianos);
        double cosseno = Math.cos(radianos);
        double tangente = Math.tan(radianos);

        System.out.println("Ângulo em radianos: " + radianos);
        System.out.println("Seno: " + seno);
        System.out.println("Cosseno: " + cosseno);
        System.out.println("Tangente: " + tangente);

        if (seno != 0) {
            System.out.println("Cossecante: " + (1 / seno));
        } else {
            System.out.println("Cossecante: indefinida (seno = 0)");
        }

        if (cosseno != 0) {
            System.out.println("Secante: " + (1 / cosseno));
        } else {
            System.out.println("Secante: indefinida (cosseno = 0)");
        }

        if (tangente != 0) {
            System.out.println("Cotangente: " + (1 / tangente));
        } else {
            System.out.println("Cotangente: indefinida (tangente = 0)");
        }

        leitor.close();
    }
}