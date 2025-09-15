import java.util.Scanner;

public class Angulo{
    public static void main(String[] args) {
        double n, PI = 3.14;
        Scanner leitor = new Scanner(System.in);

        System.out.print("\nInforme o grau: ");
        n = leitor.nextDouble();

        double conversor = n * (PI/180);

        System.out.println("O ângulo " +n+"° em radianos é: " + conversor);

        double seno = Math.sin(conversor);
        double cosseno = Math.cos(conversor);
        double tangente = Math.tan(conversor);
        double secante = 1.0/cosseno;
        double cossecante = 1.0/seno;
        double cotangente = 1.0/tangente;

        System.out.println("\nSeno: " + seno);
        System.out.println("Cosseno: " + cosseno);
        System.out.println("Tangente: " + tangente);
        System.out.println("Secante: " + secante);
        System.out.println("Cossecante: " + cossecante);
        System.out.println("Cotangente: " + cotangente);

        leitor.close();
    }
}