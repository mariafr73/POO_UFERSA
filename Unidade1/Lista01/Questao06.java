import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o intervalo em minutos: ");
        int minutosTotais = leitor.nextInt();

        int dias = minutosTotais / (24 * 60);
        int horas = (minutosTotais % (24 * 60)) / 60;
        int minutos = (minutosTotais % 60);

        System.out.println(minutosTotais + " minutos = " + dias + " dias, " + horas + " horas e " + minutos + " minutos.");

        leitor.close();
    }
}