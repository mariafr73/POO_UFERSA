import java.util.Scanner;

public class Fatorial{
    public static void main(String[] args){
        int n, valor, i;
        Scanner leitor = new Scanner(System.in);

        System.err.print("Informe um número: ");
        n = leitor.nextInt();

        for(valor = 0; valor <= n; valor++){
            int fat = 1;
            for(i = 1; i <= valor; i++){
                fat *= i;
            }
            System.out.println("Fatorial de " + valor + "! é: " + fat);
        }

        leitor.close();
    }
}