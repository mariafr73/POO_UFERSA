import java.util.Scanner;

public class DiaH{
    public static void main(String[] args){
        int n, dia, hora, min;
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe os minutos para a converão: ");
        n = leitor.nextInt();
        
        dia = (n / 1440);
        hora = ((n % 1440) / 60);
        min = (n % 60);

        System.out.println(n + " Equivale a "+ dia +" Dia(s), "+ hora +" Hora(s) e "+ min +" Minuto(s)");

        leitor.close();
    }
}