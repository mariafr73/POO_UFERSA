import java.util.Scanner;

public class Fevereiro{
    public static void main(String[] args){
        int dia;
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um dia do mês de fevereiro: ");
        dia = leitor.nextInt();

        switch (dia) {
            case 1, 8, 15, 22:
                System.out.println("O dia " + dia + " de fevereiro sera um domingo em 2015.");
                break;
            case 2, 9, 16, 23:
                System.out.println("O dia " + dia + " de fevereiro sera uma segunda-feira em 2015.");
                break;
            case 3, 10, 17, 24:
                System.out.println("O dia " + dia + " de fevereiro sera uma terça-feira em 2015.");
                break;      
            case 4, 11, 18, 25:
                System.out.println("O dia " + dia + " de fevereiro sera uma quarta-feira em 2015.");
                break;
            case 5, 12, 19, 26:
                System.out.println("O dia " + dia + " de fevereiro sera uma quinta-feira em 2015.");
                break;
            case 6, 13, 20, 27:
                System.out.println("O dia " + dia + " de fevereiro sera uma sexta-feira em 2015.");
                break;
            case 7, 14, 21, 28:
                System.out.println("O dia " + dia + " de fevereiro sera um sábado em 2015.");
                break;
            default:
                System.out.println("Dia inválido! Digite um valor entre 1 e 28.");
                break;
        }
        leitor.close();
    }
}