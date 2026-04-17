import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o dia do mês de fevereiro de 2015 (1 a 28): ");
        int dia = leitor.nextInt();

        String[] semana = {"Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado"};

        String diaSemana = semana[(dia - 1) % 7];

        System.out.println("O dia " + dia + " será uma " + diaSemana + ".");

        leitor.close();
    }
}