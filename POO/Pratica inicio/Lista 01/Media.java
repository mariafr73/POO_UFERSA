import java.util.Scanner;

public class Media{
    public static void main(String[] args) {
        double num1, num2, num3, m;
        Scanner leitor = new Scanner(System.in);

        System.out.print("Num1: ");
        num1 = leitor.nextDouble();

        System.out.print("Num2: ");
        num2 = leitor.nextDouble();

        System.out.print("Num3: ");
        num3 = leitor.nextDouble();

        m = media(num1, num2, num3);

        System.out.println("A media de " + num1 + ", " + num2 + " e " + num3 + " é: " + m);

        leitor.close();
    }

    public static double media(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }
}